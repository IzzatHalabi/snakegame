package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // NOTES: GO TO PRIMARY CONTROLLER
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        // Scene scene = new Scene(loader.load(), 800, 600);
        // stage.setScene(scene);
        // stage.show();

        // NOTES: SKIPPING TO INGAME CONTROLLER
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ingame.fxml"));
        loader.load();

        InGameController controller = loader.getController();
        controller.initialize(stage);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}