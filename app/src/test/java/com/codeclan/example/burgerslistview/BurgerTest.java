package com.codeclan.example.burgerslistview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class BurgerTest {

    Burger burger;

    @Before
    public void before(){
        burger = new Burger("Royale with cheese", 8.50);

    }

    @Test
    public void burgerHasName(){
        assertEquals("Royale with cheese", burger.getName());
    }

    @Test
    public void burgerHasPrice(){
        assertEquals(8.50, burger.getPrice(),0.00);
    }


}
