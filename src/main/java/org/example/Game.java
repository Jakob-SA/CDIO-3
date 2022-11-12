package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    List<Player> players;
    DieCup dieCup = new DieCup(6);
    Scanner input = new Scanner(System.in);
    Board board = new Board();
    public void test () {
        board.makeFields();
        createPlayers(2);
        System.out.println(players.size());


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


    }
}
