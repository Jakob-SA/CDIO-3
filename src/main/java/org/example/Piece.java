package org.example;

public class Piece {
    private int location;
    private String color;



    public int addLocation(int dieSum)
    {
        location+=dieSum;
        return location;
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
