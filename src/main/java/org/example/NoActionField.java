package org.example;

public class NoActionField extends Field {

    public NoActionField(String name) {
        super(name);
    }
    public int landedOn(Player player){

        return 0;
    }
    public String toString(){
        return "" + getName();
    }
}
