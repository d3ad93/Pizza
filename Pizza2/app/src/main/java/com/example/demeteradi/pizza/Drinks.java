package com.example.demeteradi.pizza;

/**
 * Created by demeteradi on 2018. 04. 07..
 */

public class Drinks {

    //id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //constructor
    public Drinks(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
