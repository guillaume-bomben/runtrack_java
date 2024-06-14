package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) {
        // Définir le titre de la fenêtre
        primaryStage.setTitle("Fenêtre Simple avec BorderPane");

        // Créer un BorderPane
        BorderPane borderPane = new BorderPane();

        // Créer un bouton "Quitter"
        Button quitButton = new Button("Quitter");

        // Ajouter un événement pour fermer l'application lorsque le bouton est cliqué
        quitButton.setOnAction(event -> {
            // Fermer l'application
            primaryStage.close();
        });

        // Ajouter le bouton "Quitter" en bas de la fenêtre
        borderPane.setBottom(quitButton);

        // Créer une scène et l'ajouter au stage
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);

        // Afficher la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
