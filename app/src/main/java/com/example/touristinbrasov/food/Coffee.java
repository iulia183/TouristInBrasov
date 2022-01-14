package com.example.touristinbrasov.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.R;
import com.example.touristinbrasov.food.coffee.Meron;
import com.example.touristinbrasov.food.coffee.Tucano;
import com.example.touristinbrasov.food.coffee.starbucks;
import com.example.touristinbrasov.food.restaurants.Tudor;

public class Coffee extends AppCompatActivity implements View.OnClickListener {

    private CardView starbucks;
    private CardView meron;
    private CardView tucano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        starbucks = (CardView) findViewById(R.id.cardView);
        meron = (CardView) findViewById(R.id.cardView2);
        tucano = (CardView) findViewById(R.id.cardView3);

        starbucks.setOnClickListener(this);
        meron.setOnClickListener(this);
        tucano.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, com.example.touristinbrasov.food.coffee.starbucks.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Meron.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Tucano.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}