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
        System.out.println(board.fields[6].getName());

    }
    public void createPlayers(int numberOfPlayers) {
        players = new ArrayList<Player>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player newPlayer = new Player(input.nextLine());
            players.add(newPlayer);
        }
    }
}
