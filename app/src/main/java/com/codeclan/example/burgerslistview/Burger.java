package com.codeclan.example.burgerslistview;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class Burger {

    private String name;
    private String price;

    public Burger(String name, String price){
        this.price = price;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }
}
