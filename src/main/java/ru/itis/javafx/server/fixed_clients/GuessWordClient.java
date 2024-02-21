package ru.itis.javafx.server.fixed_clients;

import javafx.application.Platform;
import ru.itis.javafx.fx.controllers.GuessWordController;
import ru.itis.javafx.fx.windows.GuessWordWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GuessWordClient {
    private static final String ip = "localhost";
    private static final Integer port = 8888;

    public static void main(String[] args) {
        Platform.startup(GuessWordWindow::show);
        GuessWordController guessWordController = null;

        while (guessWordController == null) {
            guessWordController = GuessWordController.getInstance();
            System.out.println(guessWordController);
        }

        try (Socket socket = new Socket(ip, port)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                if (guessWordController.topic != null
                    && guessWordController.word != null
                    && !guessWordController.isUsed)
                {
                    writer.
                }
            }
        } catch (Exception e) {

        }
    }
}
