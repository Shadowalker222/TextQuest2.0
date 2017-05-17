package com.shadowcode.TextQuest2.base.path;

/**
 * Created by dmitry on 4/3/17.
 */
public class Path {
    public static class Mage extends Path{
        public static int baseMagica = 5;
        public static int baseHealth = 3;
    }
    public static class Priest extends Path{
        public static int baseMagica = 5;
        public static int baseHealth = 3;
    }
    public static class Fighter extends Path{
        public static int baseMagica = 0;
        public static int baseHealth = 10;
    }
    public static class Hunter extends Path{
        public static int baseMagica = 0;
        public static int baseHealth = 8;
    }
}
