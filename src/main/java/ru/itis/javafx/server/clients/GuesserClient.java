package ru.itis.javafx.server.clients;

import com.google.gson.Gson;
import javafx.application.Platform;
import lombok.Getter;
import lombok.Setter;
import ru.itis.javafx.MainInfo;
import ru.itis.javafx.fx.windows.GuesserWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@Getter @Setter
public class GuesserClient {
    private int wordLength;
    private Character character;

    public static void main(String[] args) {
        Platform.startup(GuesserWindow::show);
        try (Socket socket = new Socket("localhost", 8888)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            Gson gson = new Gson();

            String json = reader.readLine();
            MainInfo mainInfo = gson.fromJson(json, MainInfo.class);



            while(true) {
                if (reader.readLine() != null) {

                }
            }

        } catch (Exception e) {

        }
    }
}
