package com.example.recycler_view;

import android.app.Application;

public class App extends Application {

    private static App instance;
    private Prefs prefs;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        prefs = new Prefs(this);
    }

    public static App getInstance() {
        return instance;
    }

    public Prefs getPrefs() {
        return prefs;
    }
}
