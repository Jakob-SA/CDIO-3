package org.example;

public abstract class Field {
    protected String fieldName;
    public Field (String name)
    {
        fieldName = name;
    }

    public String getName() {
        return ""+fieldName;
    }

    public abstract void landedOn();


}
