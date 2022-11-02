package org.example;

public class Die {
    private int faceValue;
    private static int maxFaceValue;
    public Die (int dieSide) {maxFaceValue = dieSide;}
    public void roll () {
        faceValue = (int)(Math.random()*maxFaceValue)+1;
    }
    public int getFaceValue() {
        return faceValue;
    }
}
