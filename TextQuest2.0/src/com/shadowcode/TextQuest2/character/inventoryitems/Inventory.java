package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/3/17.
 */
public class Inventory {
    public static Armour[] armour = new Armour[5];
    public static Weapon[] weapons = new Weapon[5];
    public static Other[] other = new Other[20];

    void addTo (String[] a, String item) {
        a[(a.length )] = item;
    }

    void removeFrom (String[] a, String item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != item) {
                continue;
            }
            a[i] = null;
            break;
        }
    }
}
