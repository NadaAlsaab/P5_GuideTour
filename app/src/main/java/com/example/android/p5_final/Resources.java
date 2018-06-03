package com.example.android.p5_final;

public class Resources {

    String name;
    String resourceType;
    private int imageResourceId = -1;

    public Resources(String name, String resourceType, int imageResourceId) {
        this.name = name;
        this.resourceType = resourceType;
        this.imageResourceId = imageResourceId;
    }


    public String getResourceType() {
        return resourceType;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != -1;
    }




}
