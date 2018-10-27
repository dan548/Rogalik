package it.sevenbits.roguelike_game.items;

public class SimpleCoin implements ICoin{

    private int value;

    public SimpleCoin() {
        value = 5;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void improve(int points) {
        value += points;
    }
}
