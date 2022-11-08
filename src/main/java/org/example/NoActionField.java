package org.example;

public class NoActionField extends Field {

    public NoActionField(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void landedOn(Player player) {

    }
}
