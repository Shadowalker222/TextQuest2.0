package com.shadowcode.TextQuest2.base.spells.Misc;

/**
 * Created by dmitry on 4/4/17.
 */
public class MiscSpell {
    String name;
    int range;
    int damage;
    int magicaCost;
    String special;

    public void spellConstructor (String n, int r, int d, int m, String s) {
        name = n;
        range = r;
        damage = d;
        magicaCost = m;
        special = s;
    }
}
