package com.shadowcode.TextQuest2.gameplay;

import com.shadowcode.TextQuest2.base.path.Path;
import com.shadowcode.TextQuest2.character.Character;

import javax.swing.*;

import static com.shadowcode.TextQuest2.graphics.Display.ccg;

/**
 * Created by dmitry on 4/6/17.
 */
public class Charactercreator {

    String charactername;
    int Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;
    Path chosenpath = new Path();
    String[] paths = new String[4];
    Path.Mage mage = new Path.Mage();
    Path.Priest priest = new Path.Priest();
    Path.Fighter fighter = new Path.Fighter();
    Path.Hunter hunter = new Path.Hunter();
    JLabel label = ccg.label;
    JTextField field = ccg.field;

    public static Character character1 = new Character();

    void setCharactername () throws InterruptedException {
        label.setText("What would you like your character to be called?");
        wait(1000);
        charactername = field.getText();
        label.setText("");
        wait(1000);
    }

    void setAbilityScores () throws InterruptedException {
        int points = 80;
        int temp;

        label.setText("There are 6 Ability Scores. You have 80 points. You must split the points amongst them.");
        wait(1000);

        temp = setAbilityScore(Strength, points, "Strength");
        points = temp;

        temp = setAbilityScore(Dexterity, points, "Dexterity");
        points = temp;

        temp = setAbilityScore(Constitution, points, "Constitution");
        points = temp;

        temp = setAbilityScore(Intelligence, points, "Intelligence");
        points = temp;

        temp = setAbilityScore(Wisdom, points, "Wisdom");
        points = temp;

        temp = setAbilityScore(Charisma, points, "Charisma");

        wait(1000);
    }

    void pathSelect () throws InterruptedException{
        paths[0] = "Mage";
        paths[1] = "Priest";
        paths[2] = "Fighter";
        paths[3] = "Hunter";
        String temp;
        boolean accepted = false;

        label.setText("There are " + paths.length + " Paths. The paths are: " + paths[0] + ", " + paths[1] + ", " + paths[2] + ", " + paths[3] + ". You must chose a Path.");
        wait(1000);

        while (accepted != true) {
            temp = field.getText();
            if (temp == "Mage" || temp == "mage") {
                chosenpath = mage;
                accepted = true;
                continue;
            } else if (temp == "Priest" || temp == "priest") {
                chosenpath = priest;
                accepted = true;
                continue;
            } else if (temp == "Fighter" || temp == "fighter") {
                chosenpath = fighter;
                accepted = true;
                continue;
            } else if (temp == "Hunter" || temp == "hunter") {
                chosenpath = hunter;
                accepted = true;
                continue;
            } else {
                label.setText("Didn't get that. Try again?");
                accepted = false;
                wait(1000);
                continue;
            }
        }

        label.setText("");
        wait(1000);
    }

    int setAbilityScore (int score, int points, String scName) throws InterruptedException {
        boolean accepted = false;
        int temp;

        while (accepted != true) {
            label.setText("What would you like your " + scName + " score to be? You have " + points + " points left.");
            wait(1000);
            try {
                temp = Integer.parseInt(field.getToolTipText());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                accepted = false;
                label.setText("That was not an integer. Please type an integer.");
                wait(1000);
                continue;
            }

            if (temp <= points) {
                score = temp;
                points -= temp;
                accepted = true;
            } else {
                label.setText("That was more than you have. Please do not try to cheat.");
                wait(1000);
                accepted = false;
            }
        }

        label.setText("");
        wait(1000);
        return points;
    }

    void createCharacter () throws InterruptedException{
        setCharactername();
        setAbilityScores();
        pathSelect();

        character1.characterConstructor(charactername, Strength, Charisma, Dexterity, Constitution, Wisdom, Intelligence, chosenpath);
    }
}
