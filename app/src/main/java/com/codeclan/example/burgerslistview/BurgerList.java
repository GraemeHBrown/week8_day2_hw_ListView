package com.codeclan.example.burgerslistview;

import java.util.ArrayList;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class BurgerList {

    private ArrayList<Burger> burgers;

    public BurgerList(){
        burgers = new ArrayList<>();
        burgers.add(new Burger("Royale", 8.50));
        burgers.add(new Burger("Royale with cheese", 9.00));
        burgers.add(new Burger("Big Mac", 5.00));
        burgers.add(new Burger("McChicken Sandwich", 5.75));
        burgers.add(new Burger("BLT burger", 6.75));
        burgers.add(new Burger("Whopper", 4.75));
        burgers.add(new Burger("McWhopper", 6.75));
        burgers.add(new Burger("Sunshine on Beef", 7.35));
        burgers.add(new Burger("Mexican Burger", 7.55));
        burgers.add(new Burger("Jalapeno Burger", 5.20));
        burgers.add(new Burger("Triple decker", 8.60));
        burgers.add(new Burger("Meat feast", 8.60));
    }

    public ArrayList<Burger> getBurgers(){
        return burgers;
    }

}
