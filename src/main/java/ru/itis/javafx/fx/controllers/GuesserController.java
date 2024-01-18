package ru.itis.javafx.fx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GuesserController {
    @FXML
    private Button А;

    @FXML
    private Button Б;

    @FXML
    private Button В;

    @FXML
    private Button Г;

    @FXML
    private Button Д;

    @FXML
    private Button Е;

    @FXML
    private Button Ё;

    @FXML
    private Button Ж;

    @FXML
    private Button З;

    @FXML
    private Button И;

    @FXML
    private Button Й;

    @FXML
    private Button К;

    @FXML
    private Button Л;

    @FXML
    private Button М;

    @FXML
    private Button Н;

    @FXML
    private Button О;

    @FXML
    private Button П;

    @FXML
    private Button Р;

    @FXML
    private Button С;

    @FXML
    private Button Т;

    @FXML
    private Button У;

    @FXML
    private Button Ф;

    @FXML
    private Button Х;

    @FXML
    private Button Ц;

    @FXML
    private Button Ч;


    @FXML
    private Button Ш;

    @FXML
    private Button Щ;

    @FXML
    private Button Ъ;

    @FXML
    private Button Ы;

    @FXML
    private Button Ь;

    @FXML
    private Button Э;

    @FXML
    private Button Ю;

    @FXML
    private Button Я;

    @FXML
    private void handleButtonClick(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button clickedButton = (Button) event.getSource();
            String buttonText = clickedButton.getText();
            System.out.println("Нажата кнопка: " + buttonText);
        }
    }
}
