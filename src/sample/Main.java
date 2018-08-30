package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
    Game Game=new Game();
    @Override
    public void start(Stage primaryStage) throws Exception{

        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane pane=new GridPane();

        Button btn1=new Button();
        btn1.setOnAction(event -> {
            Game.Game(1,btn1);
        });
        Button btn2=new Button();
        btn2.setOnAction(event -> {
            Game.Game(2,btn2);
        });
        Button btn3=new Button();
        btn3.setOnAction(event -> {
            Game.Game(3,btn3);
        });
        Button btn4=new Button();
        btn4.setOnAction(event -> {
            Game.Game(4,btn4);
        });
        Button btn5=new Button();
        btn5.setOnAction(event -> {
            Game.Game(5,btn5);
        });
        Button btn6=new Button();
        btn6.setOnAction(event -> {
            Game.Game(6,btn6);
        });
        Button btn7=new Button();
        btn7.setOnAction(event -> {
            Game.Game(7,btn7);
        });
        Button btn8=new Button();
        btn8.setOnAction(event -> {
            Game.Game(8,btn8);
        });
        Button btn9=new Button();
        btn9.setOnAction(event -> {
            Game.Game(9,btn9);
        });
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25,25,25,25));
        pane.add(btn1,0,0);
        pane.add(btn2,1,0);
        pane.add(btn3,2,0);
        pane.add(btn4,0,1);
        pane.add(btn5,1,1);
        pane.add(btn6,2,1);
        pane.add(btn7,0,2);
        pane.add(btn8,1,2);
        pane.add(btn9,2,2);

        Scene scene=new Scene(pane,400,400);
        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("Tic Toc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
