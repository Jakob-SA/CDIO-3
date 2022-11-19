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

        GUIController.guiCreateboard();
        createPlayers(GUIController.guiNumberOfPlayers());
        GUIController.guiCreatePieces(players.size());
        for(int i = 0 ; i < players.size();i++){
            GUIController.guiCreatePlayer(players.get(i).getName(),players.get(i).acc.getBalance(),i);
        }
        GUIController.print("Jeg tester lige");
        takeTurn(0);
        players.get(0).piece.setLocation(0);





    }

    public void createPlayers(int numberOfPlayers) {
        players = new ArrayList<Player>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player newPlayer = new Player(GUIController.guiPlayerName());
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

    public void takeTurn(int player){
        dieCup.shake();
        //GUI ber om shake og viser øjenene
        players.get(player).piece.addLocation(dieCup.getDieSum());          //brikken flytter
        //GUI gir besked om hvilket felt der er landet på og hvad der sker.
        board.fields[players.get(player).piece.getLocation()].landedOn(players.get(player));
        GUIController.print("Your turn is done. It is now " + players.get(player+1).getName() + "s turn!");
    }
    public int chooseWinner(){
        int winner = 0;
        for (int i = 0; i < players.size();i++){
            if (players.get(winner).acc.getBalance() < players.get(i).acc.getBalance())
                winner = i;
        }
        return winner;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
