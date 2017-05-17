package com.shadowcode.TextQuest2.Adventure.Location.Maps;

import com.shadowcode.TextQuest2.Adventure.Location.Store;
import com.shadowcode.TextQuest2.character.inventoryitems.Armour;

/**
 * Created by dmitry on 4/12/17.
 */
public class SpawnVillage {
    String name = "Spawn Village";
    int noStores = 3;
    int noInns = 2;
    int noBars = 2;

    // S1
    Store OrmundsTrustyArmour = new Store();
    Armour[] OTAArmour = new Armour[2];

    // S2

    // S3

    // I1

    // I2

    // B1

    // B2

    void define() {
        OrmundsTrustyArmour.storeConstructor("Ormund's is a well respected place, as Ormund is a rather friendly guy, known for his quality armour, that won't break in a hurry.", OTAArmour, null, null, "Ormund's Trusty Armour");
    }
}
