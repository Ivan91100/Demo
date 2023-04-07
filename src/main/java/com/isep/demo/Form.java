package com.isep.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Form extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        // HBox layout = new HBox();
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        Label password = new Label("Password");
        PasswordField passwordField = new PasswordField();
        Label Email = new Label("Email");
        TextField emailField = new TextField();
        RadioButton studentButton = new RadioButton();
        RadioButton staffButton = new RadioButton();
        Button saveButton = new Button("Save");
        Button exitButton = new Button("Exit");

        saveButton.setOnAction(actionEvent -> {
            System.out.println("Hello! You clicked me!");
            nameLabel.setText(nameField.getText());
        });


        root.addRow(1,nameLabel,nameField);
        root.addRow(2, password, passwordField);
        root.addRow(3, saveButton);

        // layout.getChildren().addAll(nameLabel, password, Email, studentButton, staffButton, saveButton, exitButton);
        Scene scene = new Scene(root,200,400);
        stage.setScene(scene);
        stage.setTitle("Form");
        stage.show();
    }
}
