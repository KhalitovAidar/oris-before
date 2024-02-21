package ru.itis.javafx.fx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.itis.javafx.fx.windows.GuessWordWindow;

public class GuessWordController {
    private static GuessWordController instance;
    public static GuessWordController getInstance() {
        return instance;
    }

    @FXML
    public void initialize() {
        instance = this;
    }
    @FXML
    public Button begin;
    @FXML
    public TextField topic;
    @FXML
    public TextField word;
    public Boolean isUsed = Boolean.FALSE;
    @FXML
    private void buttonClicked(ActionEvent event) {
        if (GuessWordWindow.isActive) {
            String topicText = topic.getText();
            String wordText = word.getText();

        }
    }
}