package com.example.demeteradi.pizza;

import java.util.ArrayList;

/**
 * Created by demeteradi on 2018. 04. 07..
 */

public class Pizzas {

    //array of Pizza objects
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    //the price base of pizza
    private double basePrice;

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Pizzas(ArrayList<Pizza> pizzas, double basePrice) {
        this.pizzas = pizzas;
        this.basePrice = basePrice;
    }
}
