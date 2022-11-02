package org.example;

public class Die {
    private int faceValue1, faceValue2, maxFaceValue;
    public Die (int dieSide) {maxFaceValue = dieSide;}
    public void roll () {
        faceValue1 = (int)(Math.random()*maxFaceValue)+1;
        faceValue2 = (int)(Math.random()*maxFaceValue)+1;
    }
    public int getFaceValue1() {
        return faceValue1;
    }

    public int getFaceValue2() {
        return faceValue2;
    }
}
