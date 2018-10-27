package it.sevenbits.roguelike_game.containers;

import it.sevenbits.roguelike_game.items.IItem;

import java.util.ArrayList;
import java.util.List;

public class SimpleInventory implements IInventory {

    private List<IItem> itemList;
    private boolean isOpen;
    private int capacity;

    public SimpleInventory() {
        itemList = new ArrayList<IItem>();
        isOpen = false;
        capacity = 20;
    }

    public int getCapacity() {
        return capacity;
    }



    public void removeArmor() {

    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void clear() {

    }

    public void putItem(IItem item) {

    }

    public IItem getItem(int slot) {
        return null;
    }

    public boolean isOpen() {
        return false;
    }
}
