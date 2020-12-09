package com.example.recycler_view;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private final SharedPreferences sharedPreferences;

    public Prefs(Context context) {
        sharedPreferences = context.getSharedPreferences("prefs_auth", Context.MODE_PRIVATE);
    }

    public void setPassword(String password) {
        sharedPreferences
                .edit()
                .putString("password", password)
                .apply();
    }

    public String getPassword() {
        return sharedPreferences.getString("password", "defValue");
    }
}
