package org.example;

public class Piece {
    private int location = 0;
    private String color;

    public void addLocation(int dieSum){
        int tempLocation = location + dieSum;
        if(tempLocation>23)                     //Så længe at ens location + det man slår er større end 24
            location = tempLocation-23-1;       //Så trækkes templocation fra 24(antallet af felter) og 1 (fordi første felt er 0)
        else
            location += dieSum;
    }
    public int getLocation(){
        return location;
    }

    public void setLocation(int field) {
        location = field;
    }
    public String toString(){
        return ""+location;
    }
}
