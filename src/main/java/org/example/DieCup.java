package org.example;

public class DieCup {
    private int dieSum;

    Die die1 = new Die(6);
    Die die2 = new Die(6);

    public void shake () {
        die1.roll();
        die2.roll();
    }
    public int getDieSum() {
        dieSum = die1.getFaceValue1() + die2.getFaceValue2();
        return dieSum;
    }
}
