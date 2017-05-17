package com.shadowcode.TextQuest2.base.spells.priest;

/**
 * Created by dmitry on 4/4/17.
 */
public class PriestSpellFormulator {
    public static PriestSpell QuickHeal = new PriestSpell();
    public static PriestSpell UltimateHeal = new PriestSpell();

    void define () {
        QuickHeal.spellConstructor("Quick Heal" , 5, 2, "none");
        UltimateHeal.spellConstructor("Ultimate Heal" , 40, 10, "resurrect");
    }
}
