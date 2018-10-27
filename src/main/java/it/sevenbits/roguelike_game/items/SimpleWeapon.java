package it.sevenbits.roguelike_game.items;

public class SimpleWeapon implements IWeapon {

    private int damage;

    public SimpleWeapon() {
        damage = 20;
    }

    public int getValue() {
        return damage;
    }

    public void improve(int points) {
        damage += points;
    }

    public void setValue(int value) {
        damage = value;
    }
}
