package com.codeclan.example.burgerslistview;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class Burger {

    private String name;
    private Double price;

    public Burger(String name, Double price){
        this.price = price;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
