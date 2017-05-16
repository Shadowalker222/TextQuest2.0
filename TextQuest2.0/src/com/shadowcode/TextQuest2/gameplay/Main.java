package com.shadowcode.TextQuest2.gameplay;

import com.shadowcode.TextQuest2.graphics.Display;

/**
 * Created by dmitry on 4/5/17.
 */
public class Main {
    Thread thread;
    Display display;
    boolean running = false;

    void start() {
        thread.start();
        display.setEnabled(true);
        running = true;
    }

    void stop() throws InterruptedException {
        thread.join();

    }

    void running() {

    }

    void tick() {

    }
}
