package com.shadowcode.TextQuest2.character;

/**
 * Created by dmitry on 4/4/17.
 */
public class Level {
    int lvl;
    int xp;

    int[] xpToLvlUp = new int[20];

    void define () {
        lvl = 1;
        xp = 0;

        xpToLvlUp[0] = 0;
        xpToLvlUp[1] = 130;
        xpToLvlUp[2] = 330;
        xpToLvlUp[3] = 600;
        xpToLvlUp[4] = 1000;
        xpToLvlUp[5] = 1500;
        xpToLvlUp[6] = 2300;
        xpToLvlUp[7] = 3400;
        xpToLvlUp[8] = 5000;
        xpToLvlUp[9] = 7100;
        xpToLvlUp[10] = 10500;
        xpToLvlUp[11] = 14500;
        xpToLvlUp[12] = 21000;
        xpToLvlUp[13] = 29500;
        xpToLvlUp[14] = 42500;
        xpToLvlUp[15] = 60000;
        xpToLvlUp[16] = 85000;
        xpToLvlUp[17] = 120000;
        xpToLvlUp[18] = 170000;
        xpToLvlUp[19] = 240000;
    }

    void addXp (int x) {
        xp += x;

        for (int i = 0; i < 5; i++) {
            if (xp >= xpToLvlUp[lvl]) {
                lvlUp();
            }
        }
    }

    void lvlUp () {
        lvl++;
    }
}
