package ru.itis.javafx.fx.windows;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuessWordWindow {
    public static Boolean isActive = Boolean.FALSE;
    private static FXMLLoader loader = null;
    public static void show() {
        Stage stage = new Stage();
        try {
            loader = new FXMLLoader(GuessWordWindow.class.getResource("/ru/itis/javafx/guess-word.fxml")); // обращаемся к статическому полю
            setLoader(loader);
            Parent root = loader.load();
            stage.setScene(new Scene(root, 600, 600));
            stage.show();
            isActive = Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static FXMLLoader getLoader() {
        return loader;
    }

    public static void setLoader(FXMLLoader loader) {
        GuessWordWindow.loader = loader;
    }
}
