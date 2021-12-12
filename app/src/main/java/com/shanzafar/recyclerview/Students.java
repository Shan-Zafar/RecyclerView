package com.shanzafar.recyclerview;

public class Students {
    private int id;
    private int imageID;
    private String name;


    public Students(int id, String name, int imageID) {
        this.id = id;
        this.name = name;
        this.imageID = imageID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}


