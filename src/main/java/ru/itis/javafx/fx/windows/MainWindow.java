package ru.itis.javafx.fx.windows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.itis.javafx.server.MyServer;

public class MainWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/ru/itis/javafx/main.fxml"));
        Scene scene = new Scene(mainLoader.load(), 600, 600);
        stage.setScene(scene);
        stage.show();
    }
}