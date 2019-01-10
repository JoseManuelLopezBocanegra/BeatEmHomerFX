/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.deceptionentertainment.beatemhomer.Main;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Manu López
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 450);
        primaryStage.setTitle("Beat Em Homer");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Circle bola = new Circle();
        bola.setCenterX(80);
        bola.setCenterY(80);
        bola.setRadius(10);
        bola.setFill(Color.WHITE);
        root.getChildren().add(bola);
        
        Circle bola2 = new Circle();
        bola2.setCenterX(90);
        bola2.setCenterY(75);
        bola2.setRadius(10);
        bola.setFill(Color.WHITE);
        
        root.getChildren().add(bola2);
        
        Rectangle cabeza = new Rectangle();
        cabeza.setX(110);
        cabeza.setY(60);
        cabeza.setWidth(20);
        cabeza.setHeight(40);
        cabeza.setFill(Color.YELLOW);
        
        root.getChildren().add(cabeza);
        };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
