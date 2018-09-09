package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.util.ArrayList;

/**
 * Created by Mohamed Essam on 8/30/2018.
 */
public class Game {
   CheckWinner winner=new CheckWinner();
   private ArrayList<Integer> player1 = new ArrayList<Integer>();
   private ArrayList<Integer> player2 = new ArrayList<Integer>();
   private boolean player = true;

    void Game(int celles, Button select) {
        System.out.println("celled:" + celles);
        if (player) {
            select.setText("X");
            player1.add(celles);
            player = false;
        } else if (!player) {
            select.setText("O");
            player2.add(celles);
            player = true;
        }
        select.setDisable(true);
        winner.winner(player1,player2);
    }
    }
