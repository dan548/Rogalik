package it.sevenbits.roguelike_game.entities;

import it.sevenbits.roguelike_game.containers.IInventory;
import it.sevenbits.roguelike_game.containers.SimpleInventory;

public class BaseMonster implements IMonster {

    private int hp;
    private int x;
    private int y;
    private long id;
    private IInventory inventory;

    public BaseMonster(long id) {
        hp = 200;
        this.id = id;
        inventory = new SimpleInventory();
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public long getID() {
        return id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void doDamage(int points) {
        hp -= points/10;
    }

    public void takeDamage(int points) {
        hp -= points;
    }

    public void clearInventory() {
        inventory = null;
    }

    public IInventory getInventory() {
        return inventory;
    }
}
