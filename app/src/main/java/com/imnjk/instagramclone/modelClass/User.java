package com.imnjk.instagramclone.modelClass;

public class User {
    String userimg,username;

    public User(String userimg, String username) {
        this.userimg = userimg;
        this.username = username;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }
}
