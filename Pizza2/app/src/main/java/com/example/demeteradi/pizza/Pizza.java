package com.example.demeteradi.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demeteradi on 2018. 04. 07..
 */

public class Pizza {

    //display name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ingredients
    private ArrayList<Long> ingredientsID = new ArrayList<>();

    public ArrayList<Long> getIngredientsID() {
        return ingredientsID;
    }

    public void setIngredientsID(ArrayList<Long> ingredientsID) {
        this.ingredientsID = ingredientsID;
    }

    //ImageUrl
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Pizza(String name, ArrayList<Long> ingredientsID, String imageUrl) {
        this.name = name;
        this.ingredientsID = ingredientsID;
        this.imageUrl = imageUrl;
    }

    public Pizza(String name, ArrayList<Long> ingredientsID) {
        this.name = name;
        this.ingredientsID = ingredientsID;
        this.imageUrl = null;
    }
}
