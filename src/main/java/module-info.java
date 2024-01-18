module ru.itis.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires com.google.gson;


    opens ru.itis.javafx to javafx.fxml;
    opens ru.itis.javafx.fx.controllers to javafx.fxml;

    exports ru.itis.javafx.fx.windows;
    exports ru.itis.javafx.fx.controllers;
}