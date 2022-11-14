package org.example;

public class Die {
    private int faceValue;
    private int maxFaceValue;
    public Die (int sides) {
        this.maxFaceValue = sides;
    }
    public void roll () {
        faceValue = (int)(Math.random()*maxFaceValue)+1;
    }
    public int getFaceValue() {
        return faceValue;
    }
}
