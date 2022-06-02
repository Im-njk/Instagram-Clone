package com.imnjk.instagramclone.modelClass;

public class Post {
    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPostImg() {
        return postImg;
    }

    public void setPostImg(String postImg) {
        this.postImg = postImg;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String userImg,username,postImg,caption,time;
    int likes,comments;

    public Post() {
    }

    public Post(String userImg, String username, String postImg, int likes, int comments, String caption, String time) {
        this.userImg = userImg;
        this.username = username;
        this.postImg = postImg;
        this.likes = likes;
        this.comments = comments;
        this.caption = caption;
        this.time = time;
    }
}
