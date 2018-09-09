package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;



public class Main extends Application {
    private Game Game=new Game();
    private Stage window;
    private ArrayList <Integer> draw = new ArrayList<>();
    private ArrayList<Integer> player1 = new ArrayList<Integer>();
    private ArrayList<Integer> player2 = new ArrayList<Integer>();
    private boolean player = true;
    private Button btn1=new Button();
    private Button btn2=new Button();
    private Button btn3=new Button();
    private Button btn4=new Button();
    private Button btn5=new Button();
    private Button btn6=new Button();
    private Button btn7=new Button();
    private Button btn8=new Button();
    private Button btn9=new Button();
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane pane=new GridPane();

        // Home Page
        GridPane pane1=new GridPane();
        Button start =new Button();
        start.setText("Start Game");
        pane1.setAlignment(Pos.CENTER);
        pane1.add(start,1,1);
        pane1.setStyle("-fx-background-color:#76EEE7");

        // End Page
        GridPane pane2 =new GridPane();
        Label lable = new Label();
        Label label = new Label();
        lable.setText("GAME INFO :");
        Button close= new Button();
        close.setText("Close App");
        close.setStyle("-fx-background-color:RED");
        Button retry =new Button();
        retry.setText("PLAY Again");
        retry.setStyle("-fx-background-color:GREEN;-fx-text-fill: White;");
        pane2.setAlignment(Pos.CENTER);
        pane2.add(close,1,1);
        pane2.add(retry,1,3);
        pane2.add(lable,1,4);
        pane2.add(label,2,4);
        pane2.setVgap(10);
        Scene scene2=new Scene(pane2,400,400);

        close.setOnAction(event -> {
            window.close();
        });


        btn1.setOnAction(event -> {
            Game(1,btn1,scene2,label);
        });
        btn2.setOnAction(event -> {
            Game(2,btn2,scene2,label);
        });
        btn3.setOnAction(event -> {
            Game(3,btn3,scene2,label);
        });
        btn4.setOnAction(event -> {
            Game(4,btn4,scene2,label);
        });
        btn5.setOnAction(event -> {
            Game(5,btn5,scene2,label);
        });
        btn6.setOnAction(event -> {
            Game(6,btn6,scene2,label);
        });
        btn7.setOnAction(event -> {
            Game(7,btn7,scene2,label);
        });
        btn8.setOnAction(event -> {
            Game(8,btn8,scene2,label);
        });
        btn9.setOnAction(event -> {
            Game(9,btn9,scene2,label);
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
        Scene scene1=new Scene(pane1,400,400);

        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());

        start.setOnAction(event -> {
            window.setScene(scene);
        });
        retry.setOnAction(event -> {
            retry(player1,player2);
            window.setScene(scene);
        });
        window.setTitle("Tic Toc");
        window.setScene(scene1);
        window.show();
    }


    void winner(ArrayList<Integer> player1, ArrayList<Integer> player2, Button s ,Scene scene,Label label) {
            int winner = -1;
            String msg = "";
            if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
                winner = 1;
            }
            if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
                winner = 2;
            }
            if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
                winner = 1;
            }
            if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
                winner = 2;
            }
            if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
                winner = 1;
            }
            if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
                winner = 2;
            }
            if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
                winner = 1;
            }
            if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
                winner = 2;
            }
            if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                winner = 1;
            }
            if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
                winner = 2;
            }
            if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
                winner = 1;
            }
            if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
                winner = 2;
            }
            if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                winner = 1;
            }
            if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
                winner = 2;
            }
            if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
                winner = 1;
            }
            if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
                winner = 2;
            }
            if (winner != -1) {

                if (winner == 1) {
                    draw.clear();
                    msg = "player 1 win";
                }
                if (winner == 2) {
                    draw.clear();
                    msg = "player 2 win";
                }
                window.setScene(scene);
                label.setText(msg);
//                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                alert.setTitle("Game Info");
//                alert.setHeaderText("Player Info");
//                alert.setResizable(false);
//                alert.setContentText(msg);
//                Optional<ButtonType> result = alert.showAndWait();
//                ButtonType button = result.orElse(ButtonType.CANCEL);
//                if (button == ButtonType.OK) {
//                    System.out.println("Ok pressed");
//                    window.close();
//                } else {
//                    System.out.println("canceled");
//                   retry(player1,player2,s);
                }
                checkdraw(winner,scene,label);
    }


    void Game(int celles, Button select , Scene scene,Label label) {
        System.out.println("celled:" + celles);
        if (player) {
            select.setText("X");
            player1.add(celles);
            draw.add(celles);
            player = false;
        } else if (!player) {
            select.setText("O");
            player2.add(celles);
            draw.add(celles);
            player = true;
        }
        select.setDisable(true);
        winner(player1,player2,select,scene,label);
    }


    void  retry(ArrayList<Integer> player1, ArrayList<Integer> player2){
        btn1.setText("");
        btn1.setDisable(false);
        btn2.setText("");
        btn2.setDisable(false);
        btn3.setText("");
        btn3.setDisable(false);
        btn4.setText("");
        btn4.setDisable(false);
        btn5.setText("");
        btn5.setDisable(false);
        btn6.setText("");
        btn6.setDisable(false);
        btn7.setText("");
        btn7.setDisable(false);
        btn8.setText("");
        btn8.setDisable(false);
        btn9.setText("");
        btn9.setDisable(false);
        player1.clear();
        player2.clear();

    }


    void checkdraw(int winner,Scene scene ,Label label){
        winner =-1;
        for (int i = 0; i <draw.size() ; i++) {
            System.out.println(draw.get(i));
        }
        if (draw.contains(1)&draw.contains(2)&draw.contains(3)&draw.contains(4)
           &draw.contains(5)&draw.contains(6)&draw.contains(7)&draw.contains(8)&draw.contains(9)&winner==-1){
            window.setScene(scene);
            label.setText(" Two Players are draw");
            draw.clear();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}

