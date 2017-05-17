package com.shadowcode.TextQuest2.Adventure.Bestiary;

/**
 * Created by dmitry on 4/6/17.
 */
public class Index {
    Class[] badGuys = new Class[1000];
    Class[] npcs = new Class[1000];

    void define () {
        badGuys[0] = Goblin.class;
    }
}
