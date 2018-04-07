package com.example.demeteradi.pizza;

/**
 * Created by demeteradi on 2018. 04. 07..
 */

public class Ingredients {

    //ID
    private long id;

    public long get_id() {
        return id;
    }

    public void set_id(long id) {
        this.id = id;
    }

    //name
    private String name;

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    //price
    private double price;

    public double get_price() {
        return price;
    }

    public void set_price(double price) {
        this.price = price;
    }

    //constructor
    public Ingredients(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
