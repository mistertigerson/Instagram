package com.example.instagram.adapters.models;

public class InstaModel {
    private int image;
    private String comment;
    private String date;

    public InstaModel(int image, String comment, String date) {
        this.image = image;
        this.comment = comment;
        this.date = date;
    }

    public InstaModel() {

    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }
}
