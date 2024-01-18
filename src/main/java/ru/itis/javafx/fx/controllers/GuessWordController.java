package ru.itis.javafx.fx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.itis.javafx.fx.windows.GuessWordWindow;
import ru.itis.javafx.fx.windows.GuesserWindow;
import ru.itis.javafx.server.MyServer;
import ru.itis.javafx.server.clients.Client;
import ru.itis.javafx.server.clients.GuessWordClient;
import ru.itis.javafx.server.clients.GuesserClient;

public class GuessWordController {
    @FXML
    public Button begin;
    @FXML
    private TextField topic;
    @FXML
    private TextField word;
    @FXML
    private void buttonClicked(ActionEvent event) {
        if (!GuesserWindow.isActive) {
            String topicText = topic.getText();
            String wordText = word.getText();

            GuessWordClient guessWordClient = new GuessWordClient(topicText, wordText);
            guessWordClient.setIsActive(Boolean.TRUE);

            MyServer server = new MyServer(topicText, wordText, guessWordClient);

            server.game();
        }
    }
}