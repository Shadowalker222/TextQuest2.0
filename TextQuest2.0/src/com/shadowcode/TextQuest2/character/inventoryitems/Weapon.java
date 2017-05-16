package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/3/17.
 */
public class Weapon {
    public static String name;
    public static int dmg;
    public static int cost;
    public static String type;

    void weaponConstructor (String n, int d, int c, String t) {
        name = n;
        dmg = d;
        cost = c;
        type = t;
    }
}
