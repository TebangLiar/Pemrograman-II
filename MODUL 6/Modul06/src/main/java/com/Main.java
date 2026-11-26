package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        URL fxmlLocation = Main.class.getResource("/com/example/modul06/hello-view.fxml");
        if (fxmlLocation == null) {
            File localFile = new File("Modul06/src/main/resources/com/example/modul06/hello-view.fxml");
            if (!localFile.exists()) {
                localFile = new File("src/main/resources/com/example/modul06/hello-view.fxml");
            }
            if (localFile.exists()) {
                fxmlLocation = localFile.toURI().toURL();
            }
        }
        if (fxmlLocation == null) {
            throw new IllegalStateException("File hello-view.fxml tidak ditemukan.");
        }

        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setTitle("PRAKTIKUM 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}