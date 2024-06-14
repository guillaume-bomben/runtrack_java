package com.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Boîtes de dialogue");

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            event.consume(); // Consomme l'événement pour gérer manuellement la fermeture de la fenêtre

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Voulez-vous vraiment quitter l'application?");
            alert.setContentText("Cliquez sur OK pour quitter l'application, ou sur Annuler pour revenir.");

            if (alert.showAndWait().orElse(ButtonType.CANCEL) == ButtonType.OK) {
                Platform.exit(); // Quitte l'application
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
