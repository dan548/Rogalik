package it.sevenbits.roguelike_game.entities;

import it.sevenbits.roguelike_game.containers.IInventory;

public interface IEntity {

    int getHP();
    void setHP(int hp);
    int getX();
    int getY();
    long getID();
    void setX(int x);
    void setY(int y);
    void doDamage(int points);
    void takeDamage(int points);
    void clearInventory();
    IInventory getInventory();

}
