/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.deceptionentertainment.beatemhomer.Main;
//Clases
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
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;



/**
 *
 * @author Manu López
 */
public class Main extends Application {
    //Declaracion de variables
    int personajeX = 550;
    int velocidadX = 3;
    int skinnerVolador = 30;
    int velocidadSkinner = 3;
    int velocidadSkinner2 = 0;
    int velocidadSkinner3 = 0;
    int velocidadSkinner4 = 0;
    int velocidadSkinner5 = 0;
    int velocidadSkinner6 = 0;
    int movimientoBart = 0;
    int skinnerCorriendo1 = 350;
    int skinnerCorriendo2 = 550;
    int skinnerCorriendo3 = 750;
    int skinnerCorriendo4 = 950;
    int skinnerCorriendo5 = 1150;
    int rocaY = 600;
    int rocaX = 580;
    int movimientoRoca = 2;
    int libroY = 180;
    int libroX = 350;
    int libro2Y = 180;
    int libro2X = 550;
    int libro3Y = 180;
    int libro3X = 750;
    int libro4Y = 180;
    int libro4X = 950;
    int libro5Y = 180;
    int libro5X = 1150;
    int velocidadLibro1 = 0;
    int velocidadLibro2 = 0;
    int velocidadLibro3 = 0;
    int velocidadLibro4 = 0;
    int velocidadLibro5 = 0;
    int golpe1 = 5;
    int golpe2 = 5;
    int golpe3 = 5;
    int golpe4 = 5;
    int golpe5 = 5;
    int golpe6 = 3;
    int golpe7 = 3;
    int golpe8 = 3;
    int golpe9 = 3;
    int golpe10 = 3;
    int golpeBart= 3;
    int tamañoTexto = 30;
    int marcador = 0;
    Text marcadorText = new Text ("0");
    
    public void reinicio() {
    personajeX = 550;
    skinnerVolador = 30;
    skinnerCorriendo1 = 350;
    skinnerCorriendo2 = 550;
    skinnerCorriendo3 = 750;
    skinnerCorriendo4 = 950;
    skinnerCorriendo5 = 1150;
    rocaY = 600;
    rocaX = 580;
    libroY = 180;
    libroX = 350;
    libro2Y = 180;
    libro2X = 550;
    libro3Y = 180;
    libro3X = 750;
    libro4Y = 180;
    libro4X = 950;
    libro5Y = 180;
    libro5X = 1150;
    marcador = 0;
    golpeBart = 3;
    golpe1 = 5;
    golpe2 = 5;
    golpe3 = 5;
    golpe4 = 5;
    golpe5 = 5;
}
    //Funcion
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 1452, 815);
        primaryStage.setTitle("Beat Em Homer");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Implementación de cada uno de las imagenes usadas en el juego.
        
        
        Image gameOver1 = new Image (getClass().getResourceAsStream("images/GameOver.png")) {};
        ImageView gameOver = new ImageView();
        root.getChildren().add(gameOver);
        gameOver.setX(-185);
        gameOver.setY(-170);
        gameOver.setFitWidth(950);
        gameOver.setFitHeight(750);
        gameOver.setVisible(false);
        
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
        
        Image roca = new Image(getClass().getResourceAsStream("images/roca1.png")) {};
        ImageView rocaView1 = new ImageView(roca);
        root.getChildren().add(rocaView1);
        
        Image imgSkinner1 = new Image (getClass().getResourceAsStream("images/Skinner5.png")) {};
        ImageView skinnerview1 = new ImageView (imgSkinner1);
        root.getChildren().add(skinnerview1);
        
        Image imgSkinner2 = new Image (getClass().getResourceAsStream("images/Skinner5.png")) {};
        ImageView skinnerview2 = new ImageView (imgSkinner2);
        root.getChildren().add(skinnerview2);
        
        Image imgSkinner3 = new Image (getClass().getResourceAsStream("images/Skinner5.png")) {};
        ImageView skinnerview3 = new ImageView (imgSkinner3);
        root.getChildren().add(skinnerview3);
        
        Image imgSkinner4 = new Image (getClass().getResourceAsStream("images/Skinner5.png")) {};
        ImageView skinnerview4 = new ImageView (imgSkinner4);
        root.getChildren().add(skinnerview4);
        
        Image imgSkinner5 = new Image (getClass().getResourceAsStream("images/Skinner5.png")) {};
        ImageView skinnerview5 = new ImageView (imgSkinner5);
        root.getChildren().add(skinnerview5);        
        
        Image imgLibro1 = new Image (getClass().getResourceAsStream("images/Libro1.png")) {};
        ImageView libroview1 = new ImageView (imgLibro1);
        root.getChildren().add(libroview1);
        
        Image imgLibro2 = new Image (getClass().getResourceAsStream("images/Libro1.png")) {};
        ImageView libroview2 = new ImageView (imgLibro2);
        root.getChildren().add(libroview2);
        
        Image imgLibro3 = new Image (getClass().getResourceAsStream("images/Libro1.png")) {};
        ImageView libroview3 = new ImageView (imgLibro3);
        root.getChildren().add(libroview3);
        
        Image imgLibro4 = new Image (getClass().getResourceAsStream("images/Libro1.png")) {};
        ImageView libroview4 = new ImageView (imgLibro4);
        root.getChildren().add(libroview4);
        
        Image imgLibro5 = new Image (getClass().getResourceAsStream("images/Libro1.png")) {};
        ImageView libroview5 = new ImageView (imgLibro5);
        root.getChildren().add(libroview5);
        
        Image imgCorazon1 = new Image (getClass().getResourceAsStream("images/Corazon.png")) {};
        ImageView corazonView1 = new ImageView (imgCorazon1);
        corazonView1.setLayoutX (1402);
        root.getChildren().add(corazonView1);
        
        Image imgCorazon2 = new Image (getClass().getResourceAsStream("images/Corazon.png")) {};
        ImageView corazonView2 = new ImageView (imgCorazon2);
        corazonView2.setLayoutX (1402-50);
        root.getChildren().add(corazonView2);
        
        Image imgCorazon3 = new Image (getClass().getResourceAsStream("images/Corazon.png")) {};
        ImageView corazonView3 = new ImageView (imgCorazon3);
        corazonView3.setLayoutX (1402-100);
        root.getChildren().add(corazonView3);
        
      //Creación del personaje, formado por rectangulos, triangulos y circulos.

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
        
        Rectangle roca2 = new Rectangle();
        roca2.setWidth(29);
        roca2.setHeight(24);
        roca2.setVisible(false);
        root.getChildren().add(roca2);
    
        Rectangle rectSkinner1 = new Rectangle();
        rectSkinner1.setWidth(90);
        rectSkinner1.setHeight(150);
        rectSkinner1.setVisible(false);
        root.getChildren().add(rectSkinner1);
        
        Rectangle rectSkinner2 = new Rectangle();
        rectSkinner2.setWidth(90);
        rectSkinner2.setHeight(150);
        rectSkinner2.setVisible(false);
        root.getChildren().add(rectSkinner2);
        
        Rectangle rectSkinner3 = new Rectangle();
        rectSkinner3.setWidth(90);
        rectSkinner3.setHeight(150);
        rectSkinner3.setVisible(false);
        root.getChildren().add(rectSkinner3);
        
        Rectangle rectSkinner4 = new Rectangle();
        rectSkinner4.setWidth(90);
        rectSkinner4.setHeight(150);
        rectSkinner4.setVisible(false);
        root.getChildren().add(rectSkinner4);
        
        Rectangle rectSkinner5 = new Rectangle();
        rectSkinner5.setWidth(90);
        rectSkinner5.setHeight(150);
        rectSkinner5.setVisible(false);
        root.getChildren().add(rectSkinner5);
        
        Rectangle rectLibro1 =  new Rectangle();
        rectLibro1.setWidth(30);
        rectLibro1.setHeight(29);
        rectLibro1.setVisible(false);
        root.getChildren().add(rectLibro1);
        
        Rectangle rectLibro2 = new Rectangle();
        rectLibro2.setWidth(30);
        rectLibro2.setHeight(29);
        rectLibro2.setVisible(false);
        root.getChildren().add(rectLibro2);
        
        Rectangle rectLibro3 = new Rectangle();
        rectLibro3.setWidth(30);
        rectLibro3.setHeight(29);
        rectLibro3.setVisible(false);
        root.getChildren().add(rectLibro3);
        
        Rectangle rectLibro4 = new Rectangle();
        rectLibro4.setWidth(30);
        rectLibro4.setHeight(29);
        rectLibro4.setVisible(false);
        root.getChildren().add(rectLibro4);
        
        Rectangle rectLibro5 = new Rectangle();
        rectLibro5.setWidth(30);
        rectLibro5.setHeight(29);
        rectLibro5.setVisible(false);
        root.getChildren().add(rectLibro5);
        
        //Agrupación de imagenes, polígonos, y parte de las colisiones.
        
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
        
        Group grupoRoca = new Group();
        grupoRoca.getChildren().add(roca2);
        grupoRoca.getChildren().add(rocaView1);
        root.getChildren().add(grupoRoca);
        
        Group grupoSkinner1 = new Group();
        grupoSkinner1.getChildren().add(rectSkinner1);
        grupoSkinner1.getChildren().add(skinnerview1);
        root.getChildren().add(grupoSkinner1);
        
        Group grupoSkinner2 = new Group();
        grupoSkinner2.getChildren().add(rectSkinner2);
        grupoSkinner2.getChildren().add(skinnerview2);
        root.getChildren().add(grupoSkinner2);
        
        Group grupoSkinner3 = new Group();
        grupoSkinner3.getChildren().add(rectSkinner3);
        grupoSkinner3.getChildren().add(skinnerview3);
        root.getChildren().add(grupoSkinner3);
        
        Group grupoSkinner4 = new Group();
        grupoSkinner4.getChildren().add(rectSkinner4);
        grupoSkinner4.getChildren().add(skinnerview4);
        root.getChildren().add(grupoSkinner4);
        
        Group grupoSkinner5 = new Group();
        grupoSkinner5.getChildren().add(rectSkinner5);
        grupoSkinner5.getChildren().add(skinnerview5);
        root.getChildren().add(grupoSkinner5);
        
        Group grupoLibro1 = new Group();
        grupoLibro1.getChildren().add(rectLibro1);
        grupoLibro1.getChildren().add(libroview1);
        root.getChildren().add(grupoLibro1);
        
        Group grupoLibro2 = new Group();
        grupoLibro2.getChildren().add(rectLibro2);
        grupoLibro2.getChildren().add(libroview2);
        root.getChildren().add(grupoLibro2);
        
        Group grupoLibro3 = new Group();
        grupoLibro3.getChildren().add(rectLibro3);
        grupoLibro3.getChildren().add(libroview3);
        root.getChildren().add(grupoLibro3);
        
        Group grupoLibro4 = new Group();
        grupoLibro4.getChildren().add(rectLibro4);
        grupoLibro4.getChildren().add(libroview4);
        root.getChildren().add(grupoLibro4);
        
        Group grupoLibro5 = new Group();
        grupoLibro5.getChildren().add(rectLibro5);
        grupoLibro5.getChildren().add(libroview5);
        root.getChildren().add(grupoLibro5);

        //Animaciones de cada uno de los elementos de la pantalla (libros, roca, personajes secundarios y principal).
        
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
                
                marcador ++;
                marcadorText.setText(String.valueOf(marcador));
                
                skinnerview.setLayoutX(skinnerVolador);
                skinnerVolador+=velocidadSkinner;
                
                if (skinnerVolador >= 1550){
                    velocidadSkinner = -3;
                }
                
                if (skinnerVolador <= -250){
                    velocidadSkinner = 3;
                }
                
                grupoSkinner1.setLayoutX(skinnerCorriendo1);
                grupoSkinner1.setLayoutY(30);
                skinnerCorriendo1+=velocidadSkinner2;
                    
                if (skinnerCorriendo1 >=350){
                    velocidadSkinner2 = -3;
                }
                
                if (skinnerCorriendo1 <=250){
                    velocidadSkinner2 = 3;
                }
                
                grupoSkinner2.setLayoutX(skinnerCorriendo2);
                grupoSkinner2.setLayoutY(30);
                skinnerCorriendo2+=velocidadSkinner3;
                
                if (skinnerCorriendo2 >=550){
                    velocidadSkinner3 = -3;
                }
                
                if (skinnerCorriendo2 <=450){
                    velocidadSkinner3 = 3;
                }
                
                grupoSkinner3.setLayoutX(skinnerCorriendo3);
                grupoSkinner3.setLayoutY(30);
                skinnerCorriendo3+=velocidadSkinner4;
                
                if (skinnerCorriendo3 >=750){
                    velocidadSkinner4 = -3;
                }
                
                if (skinnerCorriendo3 <=650){
                    velocidadSkinner4 = 3;
                }
                
                grupoSkinner4.setLayoutX(skinnerCorriendo4);
                grupoSkinner4.setLayoutY(30);
                skinnerCorriendo4+=velocidadSkinner5;
                
                if (skinnerCorriendo4 >=950){
                    velocidadSkinner5 = -3;
                }
                
                if (skinnerCorriendo4 <=850){
                    velocidadSkinner5 = 3;
                }
                
                grupoSkinner5.setLayoutX(skinnerCorriendo5);
                grupoSkinner5.setLayoutY(30);
                skinnerCorriendo5+=velocidadSkinner6;
                
                if (skinnerCorriendo5 >=1150){
                    velocidadSkinner6 = -3;
                }
                
                if (skinnerCorriendo5 <=1050){
                    velocidadSkinner6 = 3;
                }
                
                grupoRoca.setLayoutX(rocaX);
                grupoRoca.setLayoutY(rocaY);
                rocaY+=movimientoRoca;
                movimientoRoca = -15;
                
                if (rocaY <= -10){
                    rocaY = 650;
                    rocaX = personajeX+20;
                }
                
                grupoLibro1.setLayoutX(libroX);
                grupoLibro1.setLayoutY(libroY);
                libroY+=velocidadLibro1;
                velocidadLibro1 = 6;
                
                if (libroY >= 880){
                    libroY = 180;
                    libroX = skinnerCorriendo1+20;
                }
                
                boolean sk1Visible = grupoSkinner1.isVisible();
                    if(sk1Visible == false) {
                            root.getChildren().remove(grupoSkinner1);
                            root.getChildren().remove(grupoLibro1);
                            velocidadLibro1 = 0;
                            libroY = 0; 
                    }
                    
                grupoLibro2.setLayoutX(libro2X);
                grupoLibro2.setLayoutY(libro2Y);
                libro2Y+=velocidadLibro2;
                velocidadLibro2 = 6;
                
                if (libro2Y >= 880){
                    libro2Y = 180;
                    libro2X = skinnerCorriendo2+20;
                }
                
                boolean sk2Visible = grupoSkinner2.isVisible();
                    if(sk2Visible == false) {
                            root.getChildren().remove(grupoSkinner2);
                            root.getChildren().remove(grupoLibro2);
                            velocidadLibro2 = 0;
                            libro2Y = 0;
                    }
                grupoLibro3.setLayoutX(libro3X);
                grupoLibro3.setLayoutY(libro3Y);
                libro3Y+=velocidadLibro3;
                velocidadLibro3 = 6;
                
                if (libro3Y >= 880){
                    libro3Y = 180;
                    libro3X = skinnerCorriendo3+20;
                }
                
                boolean sk3Visible = grupoSkinner3.isVisible();
                    if(sk3Visible == false) {
                            root.getChildren().remove(grupoSkinner3);
                            root.getChildren().remove(grupoLibro3);
                            velocidadLibro3 = 0;
                            libro3Y = 0;
                    }
                grupoLibro4.setLayoutX(libro4X);
                grupoLibro4.setLayoutY(libro4Y);
                libro4Y+=velocidadLibro4;
                velocidadLibro4 = 6;
                
                if (libro4Y >= 880){
                    libro4Y = 180;
                    libro4X = skinnerCorriendo4+20;
                }
                
                boolean sk4Visible = grupoSkinner4.isVisible();
                    if(sk4Visible == false) {
                            root.getChildren().remove(grupoSkinner4);
                            root.getChildren().remove(grupoLibro4);
                            velocidadLibro4 = 0;
                            libro4Y = 0;
                    }
                grupoLibro5.setLayoutX(libro5X);
                grupoLibro5.setLayoutY(libro5Y);
                libro5Y+=velocidadLibro5;
                velocidadLibro5 = 6;
                
                if (libro5Y >= 880){
                    libro5Y = 180;
                    libro5X = skinnerCorriendo5+20;
                }
                
                // Colisiones de cada uno de los personajes de nuestro juego. Cada una de ellas con una
                //velocidad y un movimiento diferente.
                
                boolean sk5Visible = grupoSkinner5.isVisible();
                    if(sk5Visible == false) {
                            root.getChildren().remove(grupoSkinner5);
                            root.getChildren().remove(grupoLibro5);
                            velocidadLibro5 = 0;
                            libro5Y = 0;
                    }
                Shape shapeColision = Shape.intersect(roca2, rectSkinner1);
                boolean colisionVacia = shapeColision.getBoundsInLocal().isEmpty();
                if (colisionVacia == false) {
                    golpe1 -- ;
                    rocaY = 650;
                    rocaX = personajeX+20;
                        if (golpe1 == 0) {
                            grupoSkinner1.setVisible(false);
                        }
                }
                
                Shape shapeColision2 = Shape.intersect(roca2, rectSkinner2);
                boolean colisionVacia2 = shapeColision2.getBoundsInLocal().isEmpty();
                if (colisionVacia2 == false) {
                    rocaY = 650;
                    rocaX = personajeX+20;
                    golpe2 -- ;
                        if (golpe2 == 0) {
                        grupoSkinner2.setVisible(false);
                        }
                }
                Shape shapeColision3 = Shape.intersect(roca2, rectSkinner3);
                boolean colisionVacia3 = shapeColision3.getBoundsInLocal().isEmpty();
                if (colisionVacia3 == false) {
                    rocaY = 650;
                    rocaX = personajeX+20;
                    golpe3 -- ;
                        if (golpe3 == 0) {
                            grupoSkinner3.setVisible(false);
                        }
                }
                Shape shapeColision4 = Shape.intersect(roca2, rectSkinner4);
                boolean colisionVacia4 = shapeColision4.getBoundsInLocal().isEmpty();
                if (colisionVacia4 == false) {
                    rocaY = 650;
                    rocaX = personajeX+20;
                    golpe4 -- ;
                        if (golpe4 == 0) { 
                            grupoSkinner4.setVisible(false);
                        }
                }
                Shape shapeColision5 = Shape.intersect(roca2, rectSkinner5);
                boolean colisionVacia5 = shapeColision5.getBoundsInLocal().isEmpty();
                if (colisionVacia5 == false) {
                    rocaY = 650;
                    rocaX = personajeX+20;
                    golpe5 -- ;
                        if (golpe5 == 0) {
                            grupoSkinner5.setVisible(false);
                        }
                }   
                Shape shapeColision6 = Shape.intersect(rectLibro1, cabeza);
                boolean colisionVacia6 = shapeColision6.getBoundsInLocal().isEmpty();
                if (colisionVacia6 == false) {
                    libroY = 180;
                    libroX = skinnerCorriendo1+20;
                    golpeBart -- ;
                        if (golpeBart == 2) {
                            root.getChildren().remove(corazonView3);
                        }
                        if (golpeBart == 1) {
                            root.getChildren().remove(corazonView2);
                        }
                        if (golpeBart == 0) {
                            root.getChildren().remove(corazonView1);
                            reinicio();
                            grupoSkinner1.setVisible(true);
                            grupoSkinner2.setVisible(true);
                            grupoSkinner3.setVisible(true);
                            grupoSkinner4.setVisible(true);
                            grupoSkinner5.setVisible(true);
                        }
                }
                Shape shapeColision7 = Shape.intersect(rectLibro2, cabeza);
                boolean colisionVacia7 = shapeColision7.getBoundsInLocal().isEmpty();
                if (colisionVacia7 == false) {
                    libro2Y = 180;
                    libro2X = skinnerCorriendo2+20;
                    golpeBart -- ;
                        if (golpeBart == 2) {
                            root.getChildren().remove(corazonView3);
                        }
                        if (golpeBart == 1) {
                            root.getChildren().remove(corazonView2);
                        }
                        if (golpeBart == 0) {
                            root.getChildren().remove(corazonView1);
                            reinicio();
                            grupoSkinner1.setVisible(true);
                            grupoSkinner2.setVisible(true);
                            grupoSkinner3.setVisible(true);
                            grupoSkinner4.setVisible(true);
                            grupoSkinner5.setVisible(true);
                        }
                }
                Shape shapeColision8 = Shape.intersect(rectLibro3, cabeza);
                boolean colisionVacia8 = shapeColision8.getBoundsInLocal().isEmpty();
                if (colisionVacia8 == false) {
                    libro3Y = 180;
                    libro3X = skinnerCorriendo3+20;
                    golpeBart -- ;
                        if (golpeBart == 2) {
                            root.getChildren().remove(corazonView3);
                        }
                        if (golpeBart == 1) {
                            root.getChildren().remove(corazonView2);
                        }
                        if (golpeBart == 0) {
                            root.getChildren().remove(corazonView1);
                            reinicio();
                            grupoSkinner1.setVisible(true);
                            grupoSkinner2.setVisible(true);
                            grupoSkinner3.setVisible(true);
                            grupoSkinner4.setVisible(true);
                            grupoSkinner5.setVisible(true);
                        }
                }
                Shape shapeColision9 = Shape.intersect(rectLibro4, cabeza);
                boolean colisionVacia9 = shapeColision9.getBoundsInLocal().isEmpty();
                if (colisionVacia9 == false) {
                    libro4Y = 180;
                    libro4X = skinnerCorriendo4+20;
                    golpeBart -- ;
                        if (golpeBart == 2) {
                            root.getChildren().remove(corazonView3);
                        }
                        if (golpeBart == 1) {
                            root.getChildren().remove(corazonView2);
                        }
                        if (golpeBart == 0) {
                            root.getChildren().remove(corazonView1);
                            reinicio();
                            grupoSkinner1.setVisible(true);
                            grupoSkinner2.setVisible(true);
                            grupoSkinner3.setVisible(true);
                            grupoSkinner4.setVisible(true);
                            grupoSkinner5.setVisible(true);
                        }
                }
                Shape shapeColision10 = Shape.intersect(rectLibro5, cabeza);
                boolean colisionVacia10 = shapeColision10.getBoundsInLocal().isEmpty();
                if (colisionVacia10 == false) {
                    libro5Y = 180;
                    libro5X = skinnerCorriendo5+20;
                    golpeBart -- ;
                        if (golpeBart == 2) {
                            root.getChildren().remove(corazonView3);
                        }
                        if (golpeBart == 1) {
                            root.getChildren().remove(corazonView2);
                        }
                        if (golpeBart == 0) {
                            root.getChildren().remove(corazonView1);
                            reinicio();
                            grupoSkinner1.setVisible(true);
                            grupoSkinner2.setVisible(true);
                            grupoSkinner3.setVisible(true);
                            grupoSkinner4.setVisible(true);
                            grupoSkinner5.setVisible(true);
                        }  
                }
            }   
        };
        animacionPersonaje.start();
        
        //Movimiento del Personaje, creado a partir de switches.
        
         scene.setOnKeyPressed((KeyEvent event) -> {
             switch(event.getCode()) {
                 case RIGHT:
                     movimientoBart = 5;
                     break;
                 case LEFT:
                     movimientoBart = -5;
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
