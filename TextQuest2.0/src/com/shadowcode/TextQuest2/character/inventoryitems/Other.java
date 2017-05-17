package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/5/17.
 */
public class Other {
    public static String name;
    public static int cost;
    public static int[] effect = new int[10];
    public static int[] effectStrength = new int[10];

    void otherConstructor (String n, int c, int[] e, int[] es) {
        name = n;
        cost = c;
        effect = e;
        effectStrength = es;
    }
}
