package org.example;

public class Piece {
    private Field location;
    private String color;



    public void addLocation(int dieSum)
    {
        location+=dieSum;

    }
    public int getLocation(){
        return location;
    }

    public void setLocation(int field)
    {
        location = field;
    }
    public String toString(){
        return ""+location;
    }
}
