package org.example;

public class ChanceCard {
    private int  randomChanceCard = (int)(Math.random()*3)+1;
    private int move, pay;
    public ChanceCard(Player player){
        if(randomChanceCard == 1){
            move = 24-player.piece.getLocation();
        }
        if(randomChanceCard == 2){
            move = 5;
        }
        if(randomChanceCard == 3){
            move = 23-player.piece.getLocation();
        }
    }
    public int getMove(){
        return move;
    }
    public int getPay(){
        return pay;
    }
}
