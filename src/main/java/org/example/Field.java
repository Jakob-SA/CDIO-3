package org.example;

public class Field {
    public int fieldNumber, buyPrice, rent;
    public String fieldName;


    public Field(int fieldNumber, int buyPrice, int rent, String fieldName) {
        this.fieldNumber = fieldNumber;
        this.fieldName = fieldName;
        this.buyPrice = buyPrice;
        this.rent = rent;
    }
}
