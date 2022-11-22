package org.example;

public class ChanceField extends Field{
    public ChanceField(String name) {
        super(name);
    }
    public String landedOn(Player player){
        ChanceCard card = new ChanceCard(player);
        player.piece.addLocation(card.getMove(),player);

        return "You landed on " + getName() + ". Press OK to draw a chancecard.";
    }
    public String toString () {
        return getName();
    }
}
