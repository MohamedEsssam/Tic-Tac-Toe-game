package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Mohamed Essam on 8/30/2018.
 */
public class CheckWinner {
    void winner(ArrayList<Integer> player1, ArrayList<Integer> player2 ) {
        int winner = -1;
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
            String msg = "";
            if (winner == 1) {
                msg = "player 1 win";
            }
            if (winner == 2) {
                msg = "player 2 win";
            }
        if (winner==-1){
                msg="players draw";
        }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Game Info");
            alert.setHeaderText("Player Info");
            alert.setResizable(false);
            alert.setContentText(msg);
            Optional<ButtonType> result = alert.showAndWait();
            ButtonType button = result.orElse(ButtonType.CANCEL);
            if (button == ButtonType.OK) {
                System.out.println("Ok pressed");
            } else {
                System.out.println("canceled");
            }
        }
    }
}
