package com.eonjava;

/**
 * Created by Erich on 9/7/2015.
 */
public class Singleton {

    private static Singleton instance;

    protected Singleton() {
        //defeat instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
