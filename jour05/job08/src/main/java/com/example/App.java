package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application avec onglets");

        TabPane tabPane = new TabPane();

        // Premier onglet avec un VBox
        Tab tab1 = new Tab("Onglet 1");
        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(new Label("Contenu de l'onglet 1"));
        tab1.setContent(vbox1);

        // Deuxième onglet avec un HBox
        Tab tab2 = new Tab("Onglet 2");
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(new Label("Contenu de l'onglet 2"));
        tab2.setContent(hbox2);

        // Ajouter les onglets au TabPane
        tabPane.getTabs().addAll(tab1, tab2);

        // Créer la scène et afficher la fenêtre
        Scene scene = new Scene(tabPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
