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

    public int landedOn(Player player) {
        if (owner == null){
            setOwner(player);
            setPlayerName(player.getName());
            player.acc.addBalance(-buyPrice);
            return buyPrice;
        } else{
            player.acc.payRent(owner.acc,buyPrice);
            return buyPrice;
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
        return super.getName() + ". The owner is " + playerName;
    }



}

