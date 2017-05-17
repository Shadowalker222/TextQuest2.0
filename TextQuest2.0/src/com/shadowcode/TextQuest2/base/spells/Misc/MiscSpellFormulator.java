package com.shadowcode.TextQuest2.base.spells.Misc;

/**
 * Created by dmitry on 4/4/17.
 */
public class MiscSpellFormulator {
    public static MiscSpell RayOfFrost = new MiscSpell();

    void define () {
        RayOfFrost.spellConstructor("Ray of Frost" ,60, 3, 1, "none");
    }
}
