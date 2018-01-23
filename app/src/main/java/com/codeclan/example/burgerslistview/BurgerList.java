package com.codeclan.example.burgerslistview;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class BurgerList {

    private ArrayList<Burger> burgers;


    public BurgerList(){
        burgers = new ArrayList<>();
        burgers.add(new Burger("Royale", "8.50"));
        burgers.add(new Burger("Royale with cheese", "9.00"));
        burgers.add(new Burger("Big Mac", "4.75"));
        burgers.add(new Burger("McChicken Sandwich", "5.25"));
        burgers.add(new Burger("BLT burger", "6.75"));
        burgers.add(new Burger("Whopper", "4.75"));
        burgers.add(new Burger("McWhopper","6.75"));
        burgers.add(new Burger("Sunshine on Beef", "5.35"));
        burgers.add(new Burger("Mexican Burger",  "7.55"));
        burgers.add(new Burger("Jalapeno Burger", "5.20"));
        burgers.add(new Burger("Triple decker", "8.60"));
        burgers.add(new Burger("Meat feast", "7.60"));
        burgers.add(new Burger("Bacon Double Cheese", "4.60"));
        burgers.add(new Burger("Triple cheese burger", "9.60"));
        burgers.add(new Burger("Man vs burger", "5.95"));
        burgers.add(new Burger("Jarrods special", "2.95"));
        burgers.add(new Burger("Greek burger", "4.95"));
        burgers.add(new Burger("Meat feast - 2", "10.95"));
    }

    public ArrayList<Burger> getBurgers(){
        return burgers;
    }

}
