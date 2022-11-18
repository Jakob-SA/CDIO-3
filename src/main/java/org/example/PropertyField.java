package org.example;

public class PropertyField extends Field {
    private int  buyPrice;
    private int rent;
    private String playerName;
    private Player owner;
    public PropertyField(Player owner, String ownerName ,String name, int price, int rent) {
        super(name);
        this.buyPrice = price;
        this.rent = rent;
        this.playerName = ownerName;
        this.owner = owner;
    }

    public String landedOn(Player player) {
        if (owner == null){
            setOwner(player);
            setPlayerName(player.getName());
            player.acc.addBalance(-buyPrice);
            return "You have bought " + getName() + " for " + buyPrice;
        } else if (owner != player){
            player.acc.payRent(owner.acc,buyPrice);
            return "You landed on " + getName() + " and payed " + buyPrice +" in rent to " + owner + "." ;
        }else {
            return "You landed on " + getName() + ". You already own this property.";
        }
    }

    public void setOwner(Player owner){
        this.owner = owner;
    }
    public void setPlayerName(String name){
        this.playerName = name;
    }
    public int getBuyPrice() {
        return buyPrice;
    }
    public String toString(){
        return getName();
    }



}

