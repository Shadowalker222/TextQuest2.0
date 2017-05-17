package com.shadowcode.TextQuest2.Adventure.Location;

import com.shadowcode.TextQuest2.character.inventoryitems.Armour;
import com.shadowcode.TextQuest2.character.inventoryitems.Other;
import com.shadowcode.TextQuest2.character.inventoryitems.Weapon;

/**
 * Created by dmitry on 4/12/17.
 */
public class Store {
    String description;
    Armour[] availableArmour;
    Weapon[] availableWeapons;
    Other[] availableOther;
    String name;

    public void storeConstructor (String d, Armour[] aa, Weapon[] aw, Other[] ao, String n) {
        name = n;
        description = d;
        availableArmour = aa;
        availableWeapons = aw;
        availableOther = ao;
    }

    public void buy (Character c) {

    }
}
