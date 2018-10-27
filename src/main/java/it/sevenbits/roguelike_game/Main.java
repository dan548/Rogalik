package it.sevenbits.roguelike_game;

import it.sevenbits.roguelike_game.containers.IContainer;
import it.sevenbits.roguelike_game.containers.SimpleChest;
import it.sevenbits.roguelike_game.entities.IEntity;
import it.sevenbits.roguelike_game.entities.SimplePlayer;
import it.sevenbits.roguelike_game.items.SimpleArmor;
import it.sevenbits.roguelike_game.items.SimpleWeapon;

public class Main {

    public static void main(String[] args) {
        IContainer chest = new SimpleChest();
        chest.putItem(new SimpleArmor());
        chest.putItem(new SimpleWeapon());
        IEntity player = new SimplePlayer(13123214, "Bill");
        chest.open();
        if(chest.isOpen()) {
            player.clearInventory();
            player.getInventory().putItem(chest.getItem(0));
            player.getInventory().putItem(chest.getItem(0));
            System.out.println(player.getInventory());
        } else {
            System.out.println("xD");
        }
    }

}
