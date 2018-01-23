package com.codeclan.example.burgerslistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by graemebrown on 23/01/2018.
 */

public class BurgerListAdapter extends ArrayAdapter<Burger> {

    public BurgerListAdapter(@NonNull Context context, @NonNull ArrayList<Burger> burgers) {
        super(context, 0, burgers);
    }

    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.burger_item, parent, false);
        }

        Burger currentBurger = getItem(position);
        TextView burgerName = listItemView.findViewById(R.id.burger_name);
        burgerName.setText(currentBurger.getName());

        TextView burgerPrice = listItemView.findViewById(R.id.burger_price);
        burgerPrice.setText(currentBurger.getPrice().toString());

        return listItemView;
    }
}
