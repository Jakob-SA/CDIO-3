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


    public String getName() {
        return super.getName();
    }

    @Override
    public int landedOn(Player player) {
        if (owner == null){
            setOwner(player);
            setPlayerName(player.getName());
            return buyPrice;
        } else{
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
        return "Owner is " + owner + " named " + playerName + "Field" + super.getName();
    }



}

