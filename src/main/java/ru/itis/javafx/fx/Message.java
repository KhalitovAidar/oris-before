package ru.itis.javafx.fx;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Message {
    private String message;
    private Boolean isNew = Boolean.FALSE;
}
