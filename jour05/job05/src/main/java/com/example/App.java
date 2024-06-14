package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Définir le titre de la fenêtre
        primaryStage.setTitle("Fenêtre avec FlowPane et Styles");

        // Créer un FlowPane
        FlowPane flowPane = new FlowPane();

        // Créer une étiquette "Nom :"
        Label nameLabel = new Label("Nom :");

        // Créer un champ de texte pour entrer le nom
        TextField nameTextField = new TextField();
        nameTextField.setPrefColumnCount(15); // Définir la taille préférée du champ de texte

        // Créer un bouton "Envoyer"
        Button submitButton = new Button("Envoyer");

        // Ajouter un gestionnaire d'événements au bouton "Envoyer"
        submitButton.setOnAction(event -> {
            // Récupérer le texte du champ de texte
            String name = nameTextField.getText();
            // Afficher le nom dans la console
            System.out.println("Nom entré : " + name);
        });

        // Ajouter les composants au FlowPane
        flowPane.getChildren().addAll(nameLabel, nameTextField, submitButton);

        // Créer une scène avec le FlowPane
        Scene scene = new Scene(flowPane, 400, 100);

        // Charger le fichier CSS
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        // Ajouter la scène au stage principal
        primaryStage.setScene(scene);

        // Afficher la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
