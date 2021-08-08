package com.example.instagram.adapters.models;

public class GridModel {
    private int image1;
    private int image2;
    private int image3;

    public GridModel(int image1, int image2, int image3) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }

    public int getImage3() {
        return image3;
    }
}
