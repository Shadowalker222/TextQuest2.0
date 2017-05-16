package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/3/17.
 */
public class Armour {
    public static String name;
    public static int AC;
    public static double cost;

    void armourConstructor (String n, int a, double c) {
        name = n;
        AC = a;
        cost = c;
    }
}
