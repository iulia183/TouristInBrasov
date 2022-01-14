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
import com.example.touristinbrasov.visit.Bucharest;
import com.example.touristinbrasov.visit.Sibiu;
import com.example.touristinbrasov.visit.Sighisoara;

public class Visit extends AppCompatActivity implements View.OnClickListener{

    private CardView sibiu;
    private CardView sighisoara;
    private CardView buc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);

        sibiu = (CardView) findViewById(R.id.cardView);
        sighisoara = (CardView) findViewById(R.id.cardView2);
        buc = (CardView) findViewById(R.id.cardView3);

        sibiu.setOnClickListener(this);
        sighisoara.setOnClickListener(this);
        buc.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Sibiu.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, Sighisoara.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Bucharest.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}