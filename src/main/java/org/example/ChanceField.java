package org.example;

public class ChanceField extends Field{
    public ChanceField(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int landedOn(Player player) {
        return 0;
    }
}
