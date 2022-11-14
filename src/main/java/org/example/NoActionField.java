package org.example;

public class NoActionField extends Field {

    public NoActionField(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }


    public int landedOn(Player player){

        return 0;
    }
}
