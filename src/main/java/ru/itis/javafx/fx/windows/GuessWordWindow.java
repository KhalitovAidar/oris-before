package ru.itis.javafx.fx.windows;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuessWordWindow {
    public static Boolean isActive = Boolean.FALSE;
    public static void show() {
        Stage stage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(GuessWordWindow.class.getResource("/ru/itis/javafx/guess-word.fxml"));
            Parent root = loader.load();
            stage.setScene(new Scene(root, 600, 600));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
