package com.shadowcode.TextQuest2.base.spells.mage;

/**
 * Created by dmitry on 4/3/17.
 */
public class MageSpell {
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
