package com.example.touristinbrasov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.museums.BUM;
import com.example.touristinbrasov.museums.First_School;
import com.example.touristinbrasov.museums.MuseumArt;
import com.example.touristinbrasov.museums.MuseumCivil;
import com.example.touristinbrasov.museums.MuseumHistory;
import com.example.touristinbrasov.museums.MuseumScience;

public class Museums extends AppCompatActivity implements View.OnClickListener {

    private CardView history;
    private CardView school;
    private CardView bum;
    private CardView civil;
    private CardView art;
    private CardView science;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        history = (CardView) findViewById(R.id.cardView);
        school = (CardView) findViewById(R.id.cardView2);
        bum = (CardView) findViewById(R.id.cardView3);
        civil = (CardView) findViewById(R.id.cardView4);
        art = (CardView) findViewById(R.id.cardView5);
        science = (CardView) findViewById(R.id.cardView6);

        history.setOnClickListener(this);
        school.setOnClickListener(this);
        bum.setOnClickListener(this);
        civil.setOnClickListener(this);
        art.setOnClickListener(this);
        science.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, MuseumHistory.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, First_School.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, BUM.class);
                startActivity(i);
                break;
            case R.id.cardView4:
                i = new Intent(this, MuseumCivil.class);
                startActivity(i);
                break;
            case R.id.cardView5:
                i = new Intent(this, MuseumArt.class);
                startActivity(i);
                break;
            case R.id.cardView6:
                i = new Intent(this, MuseumScience.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}