package com.shadowcode.TextQuest2.character;

import com.shadowcode.TextQuest2.Adventure.Location.Location;
import com.shadowcode.TextQuest2.Adventure.Location.LocationFormulator;
import com.shadowcode.TextQuest2.base.path.Path;
import com.shadowcode.TextQuest2.base.spells.Misc.MiscSpell;
import com.shadowcode.TextQuest2.base.spells.Misc.MiscSpellFormulator;
import com.shadowcode.TextQuest2.base.spells.mage.MageSpell;
import com.shadowcode.TextQuest2.base.spells.mage.MageSpellFormulator;
import com.shadowcode.TextQuest2.base.spells.priest.PriestSpell;
import com.shadowcode.TextQuest2.base.spells.priest.PriestSpellFormulator;
import com.shadowcode.TextQuest2.character.Quests.Quest;
import com.shadowcode.TextQuest2.character.inventoryitems.*;

/**
 * Created by dmitry on 4/3/17.
 */
public class Character {
    static String characterName;

    static int strength;
    static int charisma;
    static int dexterity;
    static int constitution;
    static int wisdom;
    static int intelligence;

    static int rightiousness;

    static int likeability;

    static Quest[] completedQuests = new Quest[100];
    static Quest[] activeQuests = new Quest[5];

    static Location position;

    static Level level;

    static int def;

    static int magica;
    static int maxMagica;

    static int health;
    static int maxHealth;

    static Path[] chosenPaths = new Path[3];

    static int mvmntspd;

    static MiscSpell[] miscsplzknwn = new MiscSpell[1000];
    static MageSpell[] magesplzknwn = new MageSpell[1000];
    static PriestSpell[] prstsplzknwn = new PriestSpell[1000];

    static double copyrights;

    static Inventory inventory = new Inventory();
    static Armour equipedArmour = new Armour();
    static Weapon equipedWeapon = new Weapon();

    static Weapon[] weaponProficiency = new Weapon[100];
    //static Armour[] armourProficiency;

    public static void characterConstructor (String ch, int s, int c, int d, int co, int w, int i, Path startPath) {
        characterName = ch;

        strength = s;
        charisma = c;
        dexterity = d;
        constitution = co;
        wisdom = w;
        intelligence = i;

        level = new Level();
        level.define();

        chosenPaths[0] = startPath;

        rightiousness = 10;
        likeability = 10  + Math.round(charisma / 5);

        position = LocationFormulator.spawnVillage;

        if (chosenPaths[0].getClass() == Path.Mage.class) {
            maxMagica = Path.Mage.baseMagica + intelligence;
            maxHealth = Path.Mage.baseHealth + constitution;
        } else if (chosenPaths[0].getClass() == Path.Priest.class) {
            maxMagica = Path.Priest.baseMagica + wisdom;
            maxHealth = Path.Priest.baseHealth + constitution;
        } else if (chosenPaths[0].getClass() == Path.Fighter.class) {
            maxMagica = 0;
            maxHealth = Path.Fighter.baseHealth;
        } else if (chosenPaths[0].getClass() == Path.Hunter.class) {
            maxMagica = 0;
            maxHealth = Path.Hunter.baseHealth;
        }

        if (chosenPaths[0].getClass() == Path.Mage.class) {
            miscsplzknwn[0] = MiscSpellFormulator.RayOfFrost;

            magesplzknwn[0] = MageSpellFormulator.FireBolt;
        } else if (chosenPaths[0].getClass() == Path.Priest.class) {
            miscsplzknwn[0] = MiscSpellFormulator.RayOfFrost;

            prstsplzknwn[0] = PriestSpellFormulator.QuickHeal;
        }

        if (chosenPaths[0].getClass() == Path.Hunter.class) {
            weaponProficiency[0] = WeaponFormulator.cheapBow;
        } else if (chosenPaths[0].getClass() == Path.Fighter.class) {
            weaponProficiency[0] = WeaponFormulator.cheapSword;
            weaponProficiency[1] = WeaponFormulator.basicSword;
            weaponProficiency[2] = WeaponFormulator.fancySword;
        }

        inventory.other[0] = OtherFormulator.LesserPotion;
        inventory.other[0] = OtherFormulator.LesserPotion;

        copyrights = 5;

        mvmntspd = Math.round((dexterity / 2) - (dexterity / 4));

        health = maxHealth;
        magica = maxMagica;

        def = ((dexterity - 10) / 2) + 10;
    }

    void reCalc () {
        def = Math.round((equipedArmour.AC + ((dexterity - 10) / 2)) + 10);
    }
}
