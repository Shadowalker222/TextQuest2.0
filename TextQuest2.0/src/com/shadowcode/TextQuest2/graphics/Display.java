package com.shadowcode.TextQuest2.graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dmitry on 4/5/17.
 */
public class Display extends JPanel implements ActionListener{

    public static Charactercreatorgui ccg;
    public static ShopGUI sg;
    private String currentGui;

    void ccg() {
        ccg = new Charactercreatorgui();
        ccg.define();
        currentGui = "CCG";
    }

    void removeCurrentGui() {
        if (currentGui == "CCG") {
            ccg = null;
            currentGui = "null";
        } else if (currentGui == "SG") {
            sg = null;
            currentGui = "null";
        } else if (currentGui == "null") {
            //Do nothing.
        }
    }

    void sg() {
        sg = new ShopGUI();

        currentGui = "SG";
    }

    public static void createGUI () {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
