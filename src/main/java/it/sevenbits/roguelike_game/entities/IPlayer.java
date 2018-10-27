package it.sevenbits.roguelike_game.entities;

import it.sevenbits.roguelike_game.items.IWeapon;

public interface IPlayer extends IEntity {

    void setName(String name);
    void shoot(IWeapon weapon);
}
