package com.shadowcode.TextQuest2.Adventure.Location;

import com.shadowcode.TextQuest2.character.Quests.Quest;

/**
 * Created by dmitry on 4/4/17.
 */
public class LocationFormulator {
    public static Location spawnVillage = new Location();
    Quest[] spawnVillageQuests = new Quest[1];

    void define () {
        spawnVillage.locationConstructor("Spawn Village");
    }
}
