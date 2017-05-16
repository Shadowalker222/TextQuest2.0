package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/3/17.
 */
public class WeaponFormulator {
    public static Weapon cheapSword = new Weapon();
    public static Weapon basicSword = new Weapon();
    public static Weapon fancySword = new Weapon();

    public static Weapon cheapBow = new Weapon();

    void define () {
        cheapSword.weaponConstructor("Cheap Sword", 5, 2, "M");
        basicSword.weaponConstructor("Basic Sword", 10, 6, "M");
        fancySword.weaponConstructor("Fancy Sword", 20, 30, "M");

        cheapBow.weaponConstructor("Cheap Bow", 7, 4, "R");
    }
}
