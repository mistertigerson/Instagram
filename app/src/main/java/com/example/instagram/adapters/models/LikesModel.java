package com.example.instagram.adapters.models;

public class LikesModel {
    private int image;
    private String name;
    private String text;
    private int image2;

    public LikesModel(int image, String name, String text, int image2) {
        this.image = image;
        this.name = name;
        this.text = text;
        this.image2 = image2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
