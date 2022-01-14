package com.example.touristinbrasov.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.R;
import com.example.touristinbrasov.food.coffee.Tucano;
import com.example.touristinbrasov.food.restaurants.AvramIancu;
import com.example.touristinbrasov.food.restaurants.Sergiana;
import com.example.touristinbrasov.food.restaurants.Tudor;

public class Restaurants extends AppCompatActivity implements View.OnClickListener {

    private CardView tudor;
    private CardView sergiana;
    private CardView avram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants2);

        tudor = (CardView) findViewById(R.id.cardView);
        sergiana = (CardView) findViewById(R.id.cardView2);
        avram = (CardView) findViewById(R.id.cardView3);

        tudor.setOnClickListener(this);
        sergiana.setOnClickListener(this);
        avram.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Tudor.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Sergiana.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, AvramIancu.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}