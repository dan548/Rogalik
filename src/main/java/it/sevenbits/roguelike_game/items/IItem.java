package it.sevenbits.roguelike_game.items;

public interface IItem {

    int getValue();
    void improve(int points);
    void setValue(int value);
}
