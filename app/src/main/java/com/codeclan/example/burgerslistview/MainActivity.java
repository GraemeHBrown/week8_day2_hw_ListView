package com.codeclan.example.burgerslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BurgerList burgersList;
    ArrayList<Burger> burgersToDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burgersList = new BurgerList();
        burgersToDisplay = burgersList.getBurgers();
        BurgerListAdapter adapter = new BurgerListAdapter(this, burgersToDisplay);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
