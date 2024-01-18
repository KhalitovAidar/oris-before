package ru.itis.javafx.fx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import lombok.Setter;
import ru.itis.javafx.fx.windows.GuessWordWindow;
import ru.itis.javafx.server.MyServer;
import ru.itis.javafx.server.clients.GuessWordClient;
import ru.itis.javafx.server.enums.ClientEnum;

@Getter @Setter
public class MainButtonsController {
    @FXML
    private Button guessword;
    @FXML
    private Button guesser;

    @FXML
    private void buttonClicked(ActionEvent event) {
        if (!GuessWordWindow.isActive) {
            GuessWordWindow.show();
            GuessWordWindow.isActive = Boolean.TRUE;
        }
    }
}