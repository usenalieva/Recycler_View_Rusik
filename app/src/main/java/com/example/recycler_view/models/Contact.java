package com.example.recycler_view.models;

public class Contact {
    private int profilePic;
    private String name;

    public Contact(int profilePic, String name) {
        this.profilePic = profilePic;
        this.name = name;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public String getName() {
        return name;
    }
}
