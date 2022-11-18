package org.example;

public abstract class Field {
    private String fieldName;
    public Field (String name)
    {
        fieldName = name;
    }

    public String getName() {
        return ""+fieldName;
    }


    public abstract String landedOn(Player player);


}
