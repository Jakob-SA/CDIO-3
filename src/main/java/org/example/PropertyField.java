package org.example;

public class PropertyField extends Field {
   private int  buyPrice;
    private int rent;
    private String player;



    public PropertyField(String owner ,String name, int price, int rent) {
        super(name);
        this.buyPrice = price;
        this.rent = rent;
        this.player = owner;
    }

    @Override
    public String getName() {
        return fieldName;
    }

    @Override
    public void landedOn(Player player) {



    }

    public void setOwner(String owner){
        this.player = owner;

    }
    public int getBuyPrice() {
        return buyPrice;
    }



}

