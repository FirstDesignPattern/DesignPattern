package game;

import game.Weapon.Weapon;

public  class Player {
    Weapon weapon;
    public Player(Weapon weapon){
        this.weapon = weapon;
    }
    public void attack(){
        weapon.offensive();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
