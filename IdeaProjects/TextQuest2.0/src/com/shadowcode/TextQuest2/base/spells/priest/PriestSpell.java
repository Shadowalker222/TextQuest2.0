package com.shadowcode.TextQuest2.base.spells.priest;

/**
 * Created by dmitry on 4/4/17.
 */
public class PriestSpell {
    String name;
    int heal;
    int magicaCost;
    String special;

    public void spellConstructor (String n, int h, int m, String s) {
        name = n;
        heal = h;
        magicaCost = m;
        special = s;
    }
}
