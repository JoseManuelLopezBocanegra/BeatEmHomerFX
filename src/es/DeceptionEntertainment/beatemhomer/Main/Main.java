/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.deceptionentertainment.beatemhomer.Main;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Manu López
 */
public class Main extends Application {
    int personajeX = 550;
    int velocidadX = 3;
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 1452, 815);
        primaryStage.setTitle("Beat Em Homer");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Image fondo = new Image(getClass().getResourceAsStream("images/fondo.png")) {};
        ImageView fondoview1 = new ImageView(fondo);
        root.getChildren().add(fondoview1);
                
        Rectangle cabeza = new Rectangle();
        cabeza.setX(10);
        cabeza.setY(0);
        cabeza.setWidth(60);
        cabeza.setHeight(80);
        cabeza.setFill(Color.YELLOW);
        root.getChildren().add(cabeza);
 
        Rectangle nariz = new Rectangle();
        nariz.setX(65);
        nariz.setY(43);
        nariz.setWidth(13);
        nariz.setHeight(7);
        nariz.setFill(Color.YELLOW);
        root.getChildren().add(nariz);
        
        Circle bola = new Circle();
        bola.setCenterX(50);
        bola.setCenterY(35);
        bola.setRadius(10);
        bola.setFill(Color.WHITE);
        root.getChildren().add(bola);
        
        Circle bola2 = new Circle();
        bola2.setCenterX(65);
        bola2.setCenterY(31);
        bola2.setRadius(10);
        bola2.setFill(Color.WHITE);
        root.getChildren().add(bola2);
        
        Circle bola3 = new Circle();
        bola3.setCenterX(64);
        bola3.setCenterY(31);
        bola3.setRadius(2);
        bola3.setFill(Color.BLACK);
        root.getChildren().add(bola3);
        
        Circle bola4 = new Circle();
        bola4.setCenterX(49);
        bola4.setCenterY(35);
        bola4.setRadius(2);
        bola4.setFill(Color.BLACK);
        root.getChildren().add(bola4);
        
        Rectangle camiseta = new Rectangle();
        camiseta.setX(5);
        camiseta.setY(80);
        camiseta.setWidth(72);
        camiseta.setHeight(70);
        camiseta.setFill(Color.ORANGE);
        root.getChildren().add(camiseta);
        
        Rectangle brazo1 = new Rectangle();
        brazo1.setX(77);
        brazo1.setY(86.5);
        brazo1.setWidth(15);
        brazo1.setHeight(50);
        brazo1.setFill(Color.YELLOW);
        root.getChildren().add(brazo1);
        
        Rectangle brazo2 = new Rectangle();
        brazo2.setX(-10);
        brazo2.setY(86.5);
        brazo2.setWidth(15);
        brazo2.setHeight(50);
        brazo2.setFill(Color.YELLOW);
        root.getChildren().add(brazo2);
    
        Polygon manga1 = new Polygon();
        manga1.getPoints().addAll(new Double[]{
            77.0, 90.0,
            95.0, 87.0,
            77.0, 80.0});
        manga1.setFill(Color.ORANGE);
        root.getChildren().add(manga1);
        
        Polygon manga2 = new Polygon();
        manga2.getPoints().addAll(new Double[]{
            5.0, 90.0,
            -13.0, 87.0,
            5.0, 80.0});
        manga2.setFill(Color.ORANGE);
        root.getChildren().add(manga2);
        
        Line boca = new Line();
        boca.setStartX(40);
        boca.setStartY(65);
        boca.setEndX(70);
        boca.setEndY(65);
        boca.setFill(Color.BLACK);
        root.getChildren().add(boca);
        
        Rectangle pantalon = new Rectangle();
        pantalon.setX(5);
        pantalon.setY(150);
        pantalon.setWidth(72);
        pantalon.setHeight(50);
        pantalon.setFill(Color.BLUE);
        root.getChildren().add(pantalon);
    
        Rectangle pierna1 = new Rectangle();
        pierna1.setX(15);
        pierna1.setY(200);
        pierna1.setWidth(15);
        pierna1.setHeight(20);
        pierna1.setFill(Color.YELLOW);
        root.getChildren().add(pierna1);
        
        Rectangle pierna2 = new Rectangle();
        pierna2.setX(50);
        pierna2.setY(200);
        pierna2.setWidth(15);
        pierna2.setHeight(20);
        pierna2.setFill(Color.YELLOW);
        root.getChildren().add(pierna2);
    
        Rectangle zapato1 = new Rectangle();
        zapato1.setX(50);
        zapato1.setY(220);
        zapato1.setWidth(15);
        zapato1.setHeight(20);
        zapato1.setFill(Color.BLUE);
        root.getChildren().add(zapato1);
        
        Rectangle zapato2 = new Rectangle();
        zapato2.setX(15);
        zapato2.setY(220);
        zapato2.setWidth(15);
        zapato2.setHeight(20);
        zapato2.setFill(Color.BLUE);
        root.getChildren().add(zapato2);
    
        Group groupPersonaje = new Group();
        groupPersonaje.getChildren().add(cabeza);
        groupPersonaje.getChildren().add(nariz);
        groupPersonaje.getChildren().add(bola);
        groupPersonaje.getChildren().add(bola2);
        groupPersonaje.getChildren().add(bola3);
        groupPersonaje.getChildren().add(bola4);
        groupPersonaje.getChildren().add(camiseta);
        groupPersonaje.getChildren().add(brazo1);
        groupPersonaje.getChildren().add(brazo2);
        groupPersonaje.getChildren().add(manga1);
        groupPersonaje.getChildren().add(manga2);
        groupPersonaje.getChildren().add(boca);
        groupPersonaje.getChildren().add(pantalon);
        groupPersonaje.getChildren().add(pierna1);
        groupPersonaje.getChildren().add(pierna2);
        groupPersonaje.getChildren().add(zapato1);
        groupPersonaje.getChildren().add(zapato2);
        
        groupPersonaje.setLayoutX(550);
        groupPersonaje.setLayoutY(550);
        
        root.getChildren().add(groupPersonaje);
        
        AnimationTimer animacionPersonaje = new AnimationTimer() {
            @Override
            public void handle(long how) {
                groupPersonaje.setLayoutX(personajeX);
                personajeX+=velocidadX;
                
                if (personajeX >= 1350){
                    velocidadX = -3;
                }
                if (personajeX <= 20){
                    velocidadX = 3;
                }
            }
        };
        animacionPersonaje.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
