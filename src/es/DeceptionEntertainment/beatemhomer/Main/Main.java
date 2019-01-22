/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.deceptionentertainment.beatemhomer.Main;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyEvent;



/**
 *
 * @author Manu López
 */
public class Main extends Application {
    int personajeX = 550;
    int velocidadX = 3;
    int skinnerVolador = 30;
    int velocidadSkinner = 3;
    int skinnerCorriendo1 = 50;
    int velocidadSkinner2 = 1;
    int movimientoBart = 0;
    int skinnerCorriendo2 = 160;
    int skinnerCorriendo3 = 270;
    int skinnerCorriendo4 = 380;
    int skinnerCorriendo5 = 490;
            
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
        
        Image lisa1 = new Image(getClass().getResourceAsStream("images/Lisa.gif")) {};
        ImageView lisaview1 = new ImageView(lisa1);
        lisaview1.setLayoutX(250);
        lisaview1.setLayoutY(450);
        lisaview1.setScaleX(0.4);
        lisaview1.setScaleY(0.4);
        root.getChildren().add(lisaview1);
        
        Image skinner = new Image(getClass().getResourceAsStream("images/Skinner.png")) {};
        ImageView skinnerview = new ImageView(skinner);
        skinnerview.setScaleX(0.6);
        skinnerview.setScaleY(0.6);
        root.getChildren().add(skinnerview);
        
        Image roca = new Image(getClass().getResourceAsStream("images/Roca.png")) {};
        ImageView rocaview1 = new ImageView(roca);
        rocaview1.setScaleX(0.06);
        rocaview1.setScaleY(0.06);
        root.getChildren().add(rocaview1);
        
        Image skinner1 = new Image (getClass().getResourceAsStream("images/Skinner1.gif")) {};
        ImageView skinnerview1 = new ImageView (skinner1);
        skinnerview1.setScaleX(0.8);
        skinnerview1.setScaleY(0.8);
        skinnerview1.setLayoutX(100);
        skinnerview1.setLayoutY(50);
        root.getChildren().add(skinnerview1);
        
        Image skinner2 = new Image (getClass().getResourceAsStream("images/Skinner1.gif")) {};
        ImageView skinnerview2 = new ImageView (skinner2);
        skinnerview2.setScaleX(0.8);
        skinnerview2.setScaleY(0.8);
        skinnerview2.setLayoutX(300);
        skinnerview2.setLayoutY(50);
        root.getChildren().add(skinnerview2);
        
        Image skinner3 = new Image (getClass().getResourceAsStream("images/Skinner1.gif")) {};
        ImageView skinnerview3 = new ImageView (skinner3);
        skinnerview3.setScaleX(0.8);
        skinnerview3.setScaleY(0.8);
        skinnerview3.setLayoutX(500);
        skinnerview3.setLayoutY(50);
        root.getChildren().add(skinnerview3);
        
        Image skinner4 = new Image (getClass().getResourceAsStream("images/Skinner1.gif")) {};
        ImageView skinnerview4 = new ImageView (skinner4);
        skinnerview4.setScaleX(0.8);
        skinnerview4.setScaleY(0.8);
        skinnerview4.setLayoutX(700);
        skinnerview4.setLayoutY(50);
        root.getChildren().add(skinnerview4);
        
        Image skinner5 = new Image (getClass().getResourceAsStream("images/Skinner1.gif")) {};
        ImageView skinnerview5 = new ImageView (skinner5);
        skinnerview5.setScaleX(0.8);
        skinnerview5.setScaleY(0.8);
        skinnerview5.setLayoutX(900);
        skinnerview5.setLayoutY(50);
        root.getChildren().add(skinnerview5);
        /*
        Image bob1 = new Image (getClass().getResourceAsStream("images/Bob.gif")) {};
        ImageView bobview1 = new ImageView (bob1);
        bobview1.setScaleX(0.55);
        bobview1.setScaleY(0.55);
        bobview1.setLayoutX(50);
        bobview1.setLayoutY(50);
        root.getChildren().add(bobview1);
        */
                
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
    
        Group groupBart = new Group();
        groupBart.getChildren().add(cabeza);
        groupBart.getChildren().add(nariz);
        groupBart.getChildren().add(bola);
        groupBart.getChildren().add(bola2);
        groupBart.getChildren().add(bola3);
        groupBart.getChildren().add(bola4);
        groupBart.getChildren().add(camiseta);
        groupBart.getChildren().add(brazo1);
        groupBart.getChildren().add(brazo2);
        groupBart.getChildren().add(manga1);
        groupBart.getChildren().add(manga2);
        groupBart.getChildren().add(boca);
        groupBart.getChildren().add(pantalon);
        groupBart.getChildren().add(pierna1);
        groupBart.getChildren().add(pierna2);
        groupBart.getChildren().add(zapato1);
        groupBart.getChildren().add(zapato2);
        
        groupBart.setLayoutX(600);
        groupBart.setLayoutY(600);
        groupBart.setScaleX(0.4);
        groupBart.setScaleY(0.4);
        
        root.getChildren().add(groupBart);
        
        AnimationTimer animacionPersonaje = new AnimationTimer() {
            @Override
            public void handle(long how) {
                groupBart.setLayoutX(personajeX);
                personajeX += movimientoBart;
                if(personajeX <0) {
                    personajeX = 0;
                }
                if(personajeX >1375) {
                    personajeX = 1375;
                }
                
                skinnerview.setLayoutX(skinnerVolador);
                skinnerVolador+=velocidadSkinner;
                
                if (skinnerVolador >= 1550){
                    velocidadSkinner = -3;
                }
                
                if (skinnerVolador <= -250){
                    velocidadSkinner = 3;
                }
                
                skinnerview1.setLayoutX(skinnerCorriendo1);
                skinnerCorriendo1+=velocidadSkinner2;
                
                if (skinnerCorriendo1 >=150){
                    velocidadSkinner2 = -1;
                }
                
                if (skinnerCorriendo1 <=50){
                    velocidadSkinner2 = 1;
                }
                
                skinnerview2.setLayoutX(skinnerCorriendo2);
                skinnerCorriendo2+=velocidadSkinner2;
                
                if (skinnerCorriendo2 >=280){
                    velocidadSkinner2 = -1;
                }
                
                if (skinnerCorriendo2 <=180){
                    velocidadSkinner2 = 1;
                }
            }
        };
        animacionPersonaje.start();
        
         scene.setOnKeyPressed((KeyEvent event) -> {
             switch(event.getCode()) {
                 case RIGHT:
                     movimientoBart = 4;
                     break;
                 case LEFT:
                     movimientoBart = -4;
                     break;
             }
        }); 
         scene.setOnKeyReleased((KeyEvent event) -> {
             movimientoBart = 0;
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
