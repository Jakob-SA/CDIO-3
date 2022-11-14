package org.example;

public class ChanceField extends Field{
    Piece piece = new Piece();
    public ChanceField(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int landedOn(Player player) {
        int  randomChanceCard = (int)(Math.random()*3)+1;   //Random chancecard chosen
        if(randomChanceCard==1)
            moveToStart();
        if(randomChanceCard==2)
            move5Fields();
        if(randomChanceCard==3)
            moveToSP();
        return 0;
    }
    public void moveToStart(){
        piece.setLocation(0);
    }
    public void move5Fields(){
        piece.addLocation(5);
    }
    public void moveToSP(){
        piece.setLocation(24);
    }
}
