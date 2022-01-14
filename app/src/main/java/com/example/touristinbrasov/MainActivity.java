package com.example.touristinbrasov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView museum;
    private CardView castles;
    private CardView food;
    private CardView nature;
    private CardView fun;
    private CardView visit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        museum = (CardView) findViewById(R.id.museumID);
        castles = (CardView) findViewById(R.id.castle);
        food = (CardView) findViewById(R.id.restaurant);
        nature = (CardView) findViewById(R.id.nature);
        fun = (CardView) findViewById(R.id.fun);
        visit = (CardView) findViewById(R.id.tourist);

        museum.setOnClickListener(this);
        castles.setOnClickListener(this);
        food.setOnClickListener(this);
        nature.setOnClickListener(this);
        fun.setOnClickListener(this);
        visit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.museumID:
                i = new Intent(this, Museums.class);
                startActivity(i);
                break;
            case R.id.castle:
                i = new Intent(this, Castels.class);
                startActivity(i);
                break;
            case R.id.restaurant:
                i = new Intent(this, Food.class);
                startActivity(i);
                break;
            case R.id.fun:
                i = new Intent(this, Fun.class);
                startActivity(i);
                break;
            case R.id.nature:
                i = new Intent(this, Nature.class);
                startActivity(i);
                break;
            case R.id.tourist:
                i = new Intent(this, Visit.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}