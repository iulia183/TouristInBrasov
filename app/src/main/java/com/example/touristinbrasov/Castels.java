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

public class Castels extends AppCompatActivity implements View.OnClickListener {

    private CardView bran;
    private CardView cantacuzino;
    private CardView peles;
    private CardView rasnov;
    private CardView rupea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castels);

        bran = (CardView) findViewById(R.id.cardView);
        cantacuzino = (CardView) findViewById(R.id.cardView2);
        peles = (CardView) findViewById(R.id.cardView3);
        rasnov = (CardView) findViewById(R.id.cardView4);
        rupea = (CardView) findViewById(R.id.cardView5);

        bran.setOnClickListener(this);
        cantacuzino.setOnClickListener(this);
        peles.setOnClickListener(this);
        rasnov.setOnClickListener(this);
        rupea.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Bran.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Cantacuzino.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Peles.class);
                startActivity(i);
                break;
            case R.id.cardView4:
                i = new Intent(this, Rasnov.class);
                startActivity(i);
                break;
            case R.id.cardView5:
                i = new Intent(this, Rupea.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}