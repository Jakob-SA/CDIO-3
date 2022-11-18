package org.example;

public class ChanceField extends Field{
    public ChanceField(String name) {
        super(name);
    }
    public String landedOn(Player player){
        int  randomChanceCard = (int)(Math.random()*3)+1;   //Random chancecard chosen
        if(randomChanceCard == 1){
            player.piece.setLocation(0);
        }
        if(randomChanceCard == 2){
            player.piece.addLocation(5,player);
        }
        if(randomChanceCard == 3){
            player.piece.setLocation(23);
        }
        return "You landed on " + getName() + ". Press OK to draw a chancecard.";
    }
    public String toString () {
        return getName();
    }
}
