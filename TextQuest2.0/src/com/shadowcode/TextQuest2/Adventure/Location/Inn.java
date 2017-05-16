package com.shadowcode.TextQuest2.Adventure.Location;

/**
 * Created by dmitry on 4/12/17.
 */
public class Inn {
    String name;
    String description;
    int fancyCostpNight;
    int mediumCostpNight;
    int lowCostpNight;

    public void innConstructor (String n, String d, int f, int m, int l) {
        name = n;
        description = d;
        fancyCostpNight = f;
        mediumCostpNight = m;
        lowCostpNight = l;
    }
}
