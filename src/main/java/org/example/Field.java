package org.example;

public abstract class Field {
    protected String fieldName;
    public Field (String name)
    {
        fieldName = name;
    }
    public abstract String getName ();
    public abstract void landedOn(Player player);


}
