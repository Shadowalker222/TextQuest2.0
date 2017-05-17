package com.shadowcode.TextQuest2.gameplay;

import com.shadowcode.TextQuest2.base.path.Path;
import com.shadowcode.TextQuest2.character.Character;
import com.shadowcode.TextQuest2.graphics.Charactercreatorgui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dmitry on 4/6/17.
 */
public class Charactercreator implements ActionListener{

    String charactername;
    int Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;
    Path chosenpath = new Path();
    Object[] paths = new Object[4];
    Path.Mage mage = new Path.Mage();
    Path.Priest priest = new Path.Priest();
    Path.Fighter fighter = new Path.Fighter();
    Path.Hunter hunter = new Path.Hunter();

    Charactercreatorgui charactercreatorgui = new Charactercreatorgui();

    void initialize() {
        charactercreatorgui.getSubmitButton().addActionListener(this);
        charactercreatorgui.getSubmitButton().setActionCommand("Submit");
    }

    void setValues() {
        charactername = charactercreatorgui.getNameField().getText();
        paths[0] = charactercreatorgui.getClasses().getSelectedItem();
        if (paths[0] == "Mage") {
            chosenpath = mage;
        } else if (paths[0] == "Priest") {
            chosenpath = priest;
        } else if (paths[0] == "Hunter") {
            chosenpath = hunter;
        } else if (paths[0] == "Fighter") {
            chosenpath = fighter;
        }
        Intelligence = (int) charactercreatorgui.getIntelligenceValue().getValue();
        Wisdom = (int) charactercreatorgui.getWisdomValue().getValue();
        Charisma = (int) charactercreatorgui.getCharismaValue().getValue();
        Constitution = (int) charactercreatorgui.getConstitutionValue().getValue();
        Dexterity = (int) charactercreatorgui.getDexterityValue().getValue();
        Strength = (int) charactercreatorgui.getStrengthValue().getValue();

        Character.characterConstructor(charactername, Strength, Charisma, Dexterity, Constitution, Wisdom, Intelligence, chosenpath);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        if (action.equals("Submit")) {
            setValues();
        }
    }
}
