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
import com.example.touristinbrasov.fun.Aventura;
import com.example.touristinbrasov.fun.Club;
import com.example.touristinbrasov.fun.Paradis;
import com.example.touristinbrasov.fun.Zoo;

public class Fun extends AppCompatActivity implements View.OnClickListener {

    private CardView paradis;
    private CardView aventura;
    private CardView club;
    private CardView zoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        paradis = (CardView) findViewById(R.id.cardView);
        aventura = (CardView) findViewById(R.id.cardView2);
        club = (CardView) findViewById(R.id.cardView3);
        zoo = (CardView) findViewById(R.id.cardView4);

        paradis.setOnClickListener(this);
        aventura.setOnClickListener(this);
        club.setOnClickListener(this);
        zoo.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Paradis.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Aventura.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Club.class);
                startActivity(i);
                break;
            case R.id.cardView4:
                i = new Intent(this, Zoo.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}