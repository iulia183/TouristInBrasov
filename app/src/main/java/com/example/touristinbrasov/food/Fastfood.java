package com.example.touristinbrasov.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.R;
import com.example.touristinbrasov.food.fastfood.KFC;
import com.example.touristinbrasov.food.fastfood.Mc;
import com.example.touristinbrasov.food.fastfood.Subway;

public class Fastfood extends AppCompatActivity implements View.OnClickListener {

    private CardView mc;
    private CardView kfc;
    private CardView subway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);

        mc = (CardView) findViewById(R.id.cardView);
        kfc = (CardView) findViewById(R.id.cardView2);
        subway = (CardView) findViewById(R.id.cardView3);

        mc.setOnClickListener(this);
        kfc.setOnClickListener(this);
        subway.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Mc.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, KFC.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Subway.class);
                startActivity(i);
                break;
            default:break;
        }
    }
}