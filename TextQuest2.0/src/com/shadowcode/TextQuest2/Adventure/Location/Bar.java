package com.shadowcode.TextQuest2.Adventure.Location;

import com.shadowcode.TextQuest2.character.inventoryitems.Other;

/**
 * Created by dmitry on 4/12/17.
 */
public class Bar {
    String name;
    String description;
    Other[] beverages;
    // NPC[] people
    // Character[] pcs /Add when multiplayer is implemented.

    public void barConstructor (String n, String d, Other[] b /*, NPC[] p, Character[] pc*/) {
        name = n;
        description = d;
        beverages = b;
        /*
        people = p;
        pcs = pc;
        */
    }
}
