package com.shadowcode.TextQuest2.Adventure.Location;

import com.shadowcode.TextQuest2.character.Quests.Quest;

/**
 * Created by dmitry on 4/4/17.
 */
public class Location {
    String place;
    Quest[] availableQuests;
    Quest[] completedQuests;

    void locationConstructor (String p/*, Quest[] aq uncomment later... */) {
        place = p;

        /*availableQuests = new Quest[20];
        for (int i = 0; i < aq.length; i++) {
            availableQuests[i] = aq[i];
        }
        uncomment later...
        */
    }
}
