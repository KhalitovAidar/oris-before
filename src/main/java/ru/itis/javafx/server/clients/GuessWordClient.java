package ru.itis.javafx.server.clients;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@Getter
@Setter
public class GuessWordClient implements Client {
    private String topic;
    private String word;
    private Boolean isActive = Boolean.FALSE;

    public GuessWordClient(String topic, String word) {
        this.topic = topic;
        this.word = word;
    }

    public void go() {
        try (Socket socket = new Socket("localhost", 8888)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);


        } catch (Exception e) {

        }
    }
}
