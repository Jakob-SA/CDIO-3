package org.example;

public class NoActionField extends Field {

    public NoActionField(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void landedOn(Player player) {

    }
}
