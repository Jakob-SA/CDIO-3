package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Board board = new Board();
    public void test () {
        board.makeFields();
        System.out.println();
    }
    public void createPlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numberOfPlayers ; i++) {
            Player newPlayer = new Player(input.nextLine());
            players.add(newPlayer);
        }
    }

}
