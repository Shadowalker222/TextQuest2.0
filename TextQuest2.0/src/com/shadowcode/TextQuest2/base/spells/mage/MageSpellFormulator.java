package com.shadowcode.TextQuest2.base.spells.mage;

/**
 * Created by dmitry on 4/3/17.
 */
public class MageSpellFormulator {
    public static MageSpell FireBolt = new MageSpell();
    public static MageSpell FireBall = new MageSpell();

    void define() {
        FireBolt.spellConstructor("Fire Bolt" ,45, 5, 2, "none");
        FireBall.spellConstructor("Fireball", 200, 25, 10, "burn");
    }
}
