package org.example;

public class ChanceField extends Field{
    public ChanceField(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int landedOn(Player player){
        int  randomChanceCard = (int)(Math.random()*3)+1;   //Random chancecard chosen
        if(randomChanceCard==1)
            player.piece.setLocation(0);
        if(randomChanceCard==2)
            player.piece.addLocation(5);
        if(randomChanceCard==3)
            player.piece.setLocation(23);
        return 0;
    }
}
