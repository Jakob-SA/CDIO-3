package org.example;

public class PropertyField extends Field {
    public int  buyPrice, rent;
    public String fieldName;
    public String player;


    public PropertyField(String owner ,String fieldName, int price, int rent) {
        super(1);
        this.fieldName = fieldName;
        this.buyPrice = price;
        this.rent = rent;
        this.player = owner;
    }

    @Override
    public String getName() {
        return fieldName;
    }


    public void buyField(String Player){

    }
}
