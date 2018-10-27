package it.sevenbits.roguelike_game.items;

public class SimpleArmor implements IArmor {

    private int hardness;

    public SimpleArmor() {
        hardness = 100;
    }

    public int getValue() {
        return hardness;
    }

    public void improve(int points) {
        hardness += points;
    }

    public void setValue(int value) {
        hardness = value;
    }
}
