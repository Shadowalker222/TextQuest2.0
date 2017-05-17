package com.shadowcode.TextQuest2.character.inventoryitems;

/**
 * Created by dmitry on 4/5/17.
 */
public class OtherFormulator {
    public static Other LesserPotion = new Other();
    int[] LPEffect = new int[1];
    int[] LPEStrength = new int[1];

    void define () {
        LPEffect[0] = 1;
        LPEStrength[0] = 5;

        LesserPotion.otherConstructor("Lesser Potion", 10, LPEffect, LPEStrength);
    }
}
