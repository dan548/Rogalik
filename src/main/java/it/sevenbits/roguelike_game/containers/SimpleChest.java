package it.sevenbits.roguelike_game.containers;

import it.sevenbits.roguelike_game.items.IItem;

import java.util.ArrayList;
import java.util.List;

public class SimpleChest implements IChest {

    private boolean isOpen;
    private List<IItem> items;
    private int capacity;

    public SimpleChest() {
        isOpen = false;
        items = new ArrayList<IItem>();
        capacity = 100;
    }

    public int getCapacity() {
        return capacity;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void putItem(IItem item) {
        items.add(item);
    }

    public IItem getItem(int slot) {
        if (slot < items.size()) return items.remove(slot);
        else return null;
    }
}
