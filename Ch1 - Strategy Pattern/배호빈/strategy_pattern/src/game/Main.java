package game;

import game.Weapon.Bow;
import game.Weapon.Sword;
import game.Weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Player weapon = new Player(new Sword());
        weapon.attack();

        weapon.changeWeapon(new Bow());
        weapon.attack();
    }
}
