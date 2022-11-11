package org.example;

public class Player {

    private Account acc;
    private Piece piece;

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private static int playerCount = 1;
    private int playerNumber;

    public Player (String name){
        this.name = name;
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
