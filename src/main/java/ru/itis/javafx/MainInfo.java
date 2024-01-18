package ru.itis.javafx;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class MainInfo implements Serializable {
    public String topic;
    public String word;
}
