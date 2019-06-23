package com.example.kolkatavocab;

public class Places {
    private String placeName;
    private String placeType;
    private String placeWebsite;
    private int imageResourceId;

    public Places(String name, String type, String website) {
        placeName = name;
        placeType = type;
        placeWebsite = website;
    }

    public Places(String name, String type, int imgResId, String website/*double lati, double longi*/){
        placeName = name;
        placeType = type;
        placeWebsite = website;
        imageResourceId = imgResId;
    }

    public String getPlaceName(){
        return placeName;
    }

    public String getPlaceWebsite(){
        return placeWebsite;
    }

    public int getImageResourseId(){
        return imageResourceId;
    }

    public String getPlaceType(){
        return placeType;
    }
}
