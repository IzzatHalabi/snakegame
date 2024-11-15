package com.example;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import com.example.temp.GameObject;
import com.example.temp.TriggerEvent;

import javafx.fxml.FXML;

public class InGameController {

    public static final int SCREEN_WIDTH = 500;
    public static final int SCREEN_HEIGHT = 500;

    @FXML
    private Canvas canvas;

    @FXML
    public void initialize(Stage stage) {

        GameObject.init();

        this.canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
        scene.setOnKeyPressed(TriggerEvent.keyReady(gc));

        stage.setScene(scene);
        stage.show();

    }

}
