package org.example;

public class NoActionField extends Field {

    public NoActionField(String name) {
        super(name);
    }
    public String landedOn(Player player){
        return "You landed on " + getName() + ". Not much to do here.";
    }
    public String toString(){
        return getName();
    }
}
