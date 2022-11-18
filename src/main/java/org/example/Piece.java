package org.example;

public class Piece {
    private int location = 0;
    private String color;

    public String addLocation(int dieSum, Player player){
        int tempLocation = location + dieSum;
        if(tempLocation>23) {                    //Så længe at ens location + det man slår er større end 24
            location = tempLocation - 23 - 1;//Så trækkes templocation fra 24(antallet af felter) og 1 (fordi første felt er 0)
            player.acc.addBalance(3);
            return "You passed start and you get 3M";
        }
        else
            location += dieSum;
        return null;
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
