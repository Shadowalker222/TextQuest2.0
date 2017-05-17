package com.shadowcode.TextQuest2.graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.shadowcode.TextQuest2.gameplay.Main;

/**
 * Created by dmitry on 5/17/17.
 */
public class MainMenu implements ActionListener {
    private JButton exitButton;
    private JButton loadCharacterButton;
    private JButton newCharacterButton;

    void initialize() {
        exitButton.addActionListener(this);
        exitButton.setActionCommand("Exit");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action == "Exit") {
            try {
                Main.stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
