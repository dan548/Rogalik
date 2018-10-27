package it.sevenbits.roguelike_game.containers;

import it.sevenbits.roguelike_game.items.IItem;

public interface IContainer {

    int getCapacity();
    void putItem(IItem item);
    IItem getItem(int slot);
    void open();
    void close();
    boolean isOpen();

}
