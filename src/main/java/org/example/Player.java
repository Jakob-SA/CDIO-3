package org.example;

public class Player {

    private Account acc;
    private Piece piece;
    private String name;
    private static int playerCount = 1;
    private int playerNumber;

    public Player (String title){
        name = title;
        playerNumber = playerCount;
        playerCount++;
    }
    public String getName() {
        return name;
    }
    public static int getPlayerCount() {
        return playerCount;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
}
