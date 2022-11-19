package org.example;

public class Player {

    Account acc = new Account();
    Piece piece = new Piece();

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
    public String toString(){
        return "Playernumber" + playerNumber+ name;
    }

    public Piece getPiece() {
        return piece;
    }
}
