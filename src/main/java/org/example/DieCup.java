package org.example;

public class DieCup {
    private int dieSum;
    private int maxFaceValue;
    public DieCup (int dieSides){
        maxFaceValue = dieSides;
    }
    Die die1 = new Die(6);
    //Die die2 = new Die(maxFaceValue);

    public void shake () {
        die1.roll();
        //die2.roll();
    }
    public int getDieSum() {
        dieSum = die1.getFaceValue();// + die2.getFaceValue();
        return dieSum;
    }
}
