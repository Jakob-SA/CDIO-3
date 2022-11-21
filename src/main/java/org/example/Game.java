package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    List<Player> players;
    DieCup dieCup = new DieCup(6);
    Board board = new Board();
    GUIController GUIController = new GUIController();
    ChanceField chanceField = new ChanceField("");

    private int counter = 0;


    public void test () {
        board.makeFields();
        GUIController.guiCreateboard();
        createPlayers(GUIController.guiNumberOfPlayers());
        GUIController.guiCreatePieces(players.size());
        for(int i = 0 ; i < players.size();i++){
            GUIController.guiCreatePlayer(players.get(i).getName(),players.get(i).acc.getBalance(),i);
        }
        while(players.get(counter % players.size()).acc.getBalance() >= 0) {
            takeTurn(players.get(counter % players.size()));
            counter++;
        }
        chooseWinner();

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

    public void takeTurn(Player player){
        dieCup.shake();
        GUIController.print("Press OK to roll the die!");
        GUIController.setDie(dieCup.getDieSum());
        player.piece.addLocation(dieCup.getDieSum(),player);          //brikken flytter
        GUIController.print("You rolled " + dieCup.getDieSum() + ". Press OK to move your piece.");
        checkChanceCard(player);
        GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(),player.piece.getLocation());
        GUIController.print(board.fields[player.piece.getLocation()].landedOn(player));
        GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(),player.piece.getLocation());
        GUIController.print("Your turn is done. It is now " + players.get((players.indexOf(player)+1)%players.size()).getName() + "s turn!");
    }
    public void chooseWinner(){
        int winner = 0;
        for (int i = 0; i < players.size();i++){
            if (players.get(winner).acc.getBalance() < players.get(i).acc.getBalance())
                winner = i;
        }
        GUIController.print("Winner is" + players.get(winner).toString());
    }
    public void checkChanceCard(Player player){
        if(player.piece.getLocation()==3 || player.piece.getLocation()==9 || player.piece.getLocation()==15 || player.piece.getLocation()==21) {
            if (chanceField.randomChanceCard == 1)
                GUIController.gui.displayChanceCard("Ryk til start");
            if (chanceField.randomChanceCard == 2)
                GUIController.gui.displayChanceCard("Ryk 5 felter frem");
            if (chanceField.randomChanceCard == 3)
                GUIController.gui.displayChanceCard("Ryk til Strandpromenaden");
        }
    }
}