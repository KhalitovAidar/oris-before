package ru.itis.javafx.server;

import lombok.*;
import ru.itis.javafx.MainInfo;
import ru.itis.javafx.server.clients.GuessWordClient;

import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class MyServer  {
    private static final Integer port = 8888;

    private static Boolean inGame = Boolean.FALSE;

    private String topic;
    private String word;
    private GuessWordClient guessWordClient;

    @SneakyThrows
    public void game() {
        ServerSocket serverSocket = new ServerSocket(port);

        Thread guessWordThread = new Thread(new ClientThread(guessWordClient));
        guessWordThread.start();

        Socket firstClientSocket = serverSocket.accept();
        System.out.println("Первый клиент подключен: " + firstClientSocket);

        BufferedReader firstIn = new BufferedReader(new InputStreamReader(firstClientSocket.getInputStream()));
        PrintWriter firstOut = new PrintWriter(firstClientSocket.getOutputStream(), true);

        Socket secondClientSocket = serverSocket.accept();
        System.out.println("Второй клиент подключен: " + firstClientSocket);

        BufferedReader secondIn = new BufferedReader(new InputStreamReader(secondClientSocket.getInputStream()));
        PrintWriter secondOut = new PrintWriter(secondClientSocket.getOutputStream(), true);

        MainInfo mainInfo = new MainInfo(topic, word);
        Gson gson = new Gson();
        String json = gson.toJson(mainInfo);

        OutputStreamWriter writer = new OutputStreamWriter(secondClientSocket.getOutputStream(), StandardCharsets.UTF_8);
        writer.write(json);
        writer.flush();

        while (true) {
            // Чтение сообщения от первого клиента
            String messageFromFirstClient = firstIn.readLine();
            if (messageFromFirstClient != null) {
                // Обработка сообщения от первого клиента
                System.out.println("Сообщение от первого клиента: " + messageFromFirstClient);
            }

            // Чтение сообщения от второго клиента
            String messageFromSecondClient = secondIn.readLine();
            if (messageFromSecondClient != null) {
                // Обработка сообщения от второго клиента
                System.out.println("Сообщение от второго клиента: " + messageFromSecondClient);
            }
        }
    }
}


@AllArgsConstructor
@Getter @Setter
class ClientThread implements Runnable {
    private GuessWordClient client;

    @Override
    public void run() {
        client.go();
    }
}

