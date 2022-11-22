package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    List<Player> players = new ArrayList<Player>();
    DieCup dieCup = new DieCup(6);
    Board board = new Board();
    GUIController GUIController = new GUIController();
    private int counter = 0;
    public void gameStart () {
        board.makeFields();
        GUIController.guiCreateboard();
        GUIController.guiCreatePieces(GUIController.guiNumberOfPlayers());
        createAllPLayers();
    }
    public void playGame(){
        do {
            takeTurn(players.get(counter % players.size()));
            counter++;
        } while (players.get(counter % players.size()).acc.getBalance() >= 0);
        chooseWinner();
    }
    public void createAllPLayers(){
        for (int i = 0; i < GUIController.cars.length; i++) {
            createPlayer(GUIController.guiPlayerName());
            switch (GUIController.cars.length) {
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
            GUIController.guiCreatePlayer(players.get(i).getName(), players.get(i).acc.getBalance(), i);
        }
    }
    public void createPlayer(String name) {
            Player newPlayer = new Player(name);
            players.add(newPlayer);
        }
    public void takeTurn(Player player){
        GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(), player.piece.getLocation());
        dieCup.shake();
        GUIController.print("Press OK to roll the die!");
        GUIController.setDie(dieCup.getDieSum());
        player.piece.addLocation(dieCup.getDieSum(),player);          //brikken flytter
        GUIController.print("You rolled " + dieCup.getDieSum() + ". Press OK to move your piece.");
        GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(),player.piece.getLocation());
        if (board.fields[player.piece.getLocation()].getClass() == board.fields[3].getClass()){
            GUIController.print(board.fields[player.piece.getLocation()].landedOn(player));
            GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(), player.piece.getLocation());
            GUIController.print(board.fields[player.piece.getLocation()].landedOn(player));
            GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(), player.piece.getLocation());
        } else {
            GUIController.print(board.fields[player.piece.getLocation()].landedOn(player));
            GUIController.updatePlayer(players.indexOf(player), player.acc.getBalance(), player.piece.getLocation());
        }
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
}