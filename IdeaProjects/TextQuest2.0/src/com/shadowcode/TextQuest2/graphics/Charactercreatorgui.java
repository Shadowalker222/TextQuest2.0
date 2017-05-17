package com.shadowcode.TextQuest2.graphics;

import javax.swing.*;

/**
 * Created by dmitry on 5/16/17.
 */
public class Charactercreatorgui {
    private JTextField NameField;
    private JComboBox Classes;
    private JSpinner IntelligenceValue;
    private JSpinner WisdomValue;
    private JSpinner CharismaValue;
    private JSpinner ConstitutionValue;
    private JSpinner DexterityValue;
    private JSpinner StrengthValue;
    private JTextPane Instructions;
    private JButton submitButton;

    public JTextField getNameField() {
        return NameField;
    }

    public JComboBox getClasses() {
        return Classes;
    }

    public JSpinner getIntelligenceValue() {
        return IntelligenceValue;
    }

    public JSpinner getWisdomValue() {
        return WisdomValue;
    }

    public JSpinner getCharismaValue() {
        return CharismaValue;
    }

    public JSpinner getConstitutionValue() {
        return ConstitutionValue;
    }

    public JSpinner getDexterityValue() {
        return DexterityValue;
    }

    public JSpinner getStrengthValue() {
        return StrengthValue;
    }

    public JTextPane getInstructions() {
        return Instructions;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
}
