package com.example.touristinbrasov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.castles.Bran;
import com.example.touristinbrasov.castles.Cantacuzino;
import com.example.touristinbrasov.castles.Peles;
import com.example.touristinbrasov.castles.Rasnov;
import com.example.touristinbrasov.castles.Rupea;
import com.example.touristinbrasov.food.Coffee;
import com.example.touristinbrasov.food.Fastfood;
import com.example.touristinbrasov.food.Restaurants;

public class Food extends AppCompatActivity implements View.OnClickListener {

    private CardView restaurants;
    private CardView coffee;
    private CardView fastfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        restaurants = (CardView) findViewById(R.id.cardView);
        coffee = (CardView) findViewById(R.id.cardView2);
        fastfood = (CardView) findViewById(R.id.cardView3);

        restaurants.setOnClickListener(this);
        coffee.setOnClickListener(this);
        fastfood.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Restaurants.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Coffee.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Fastfood.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}