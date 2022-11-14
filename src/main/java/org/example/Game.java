package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    List<Player> players;
    DieCup dieCup = new DieCup(6);
    Scanner input = new Scanner(System.in);
    Board board = new Board();
    GUIController GUIController = new GUIController();


    public void test () {
        board.makeFields();
        createPlayers(4);
        GUIController.guiCreateboard();
        GUIController.guiCreatePieces(players.size());
        for(int i = 0 ; i < players.size();i++){
            GUIController.guiCreatePlayer(players.get(i).getName(),players.get(i).acc.getBalance(),i);
        }




    }

    public void createPlayers(int numberOfPlayers) {
        players = new ArrayList<Player>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player newPlayer = new Player(input.nextLine());
            players.add(newPlayer);
        }
        for (int i = 0; i < numberOfPlayers; i++) {
            switch (numberOfPlayers) {
                case 2:
                    players.get(i).acc.setBalance(20);
                    break;
                case 3:
                    players.get(i).acc.setBalance(18);
                    break;
                case 4:
                    players.get(i).acc.setBalance(16);
                    break;
            }
        }
    }
    public void takeTurn(Player player){
        Helper.pressEnter("Press enter");
    }
}
