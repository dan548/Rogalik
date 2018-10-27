package it.sevenbits.roguelike_game.entities;

import it.sevenbits.roguelike_game.containers.IInventory;
import it.sevenbits.roguelike_game.containers.SimpleInventory;
import it.sevenbits.roguelike_game.items.IWeapon;

public class SimplePlayer implements IPlayer {

    private int hp;
    private int x;
    private int y;
    private long id;
    private String name;
    private IInventory inv;

    public SimplePlayer(long id, String name) {
        this.id = id;
        setName(name);
        inv = new SimpleInventory();
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

    public void setName(String name) {
        this.name = name;
    }

    public void doDamage(int points) {
        hp -= points/20;
    }

    public void takeDamage(int points) {
        hp -= points;
    }

    public void clearInventory() {
        inv.clear();
    }

    public IInventory getInventory() {
        return inv;
    }

    public void shoot(IWeapon weapon) {
        System.out.println("Bang!" + weapon);
    }
}
