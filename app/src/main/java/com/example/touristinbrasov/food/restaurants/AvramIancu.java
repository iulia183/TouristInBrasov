package com.example.touristinbrasov.food.restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class AvramIancu extends AppCompatActivity {

    Button map;
    Button order;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avram_iancu);

        map = findViewById(R.id.map);
        order = findViewById(R.id.order);
        menu = findViewById(R.id.menu);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Casa+Avram+Iancu/@45.6588439,25.5853204,17z/data=!3m1!4b1!4m5!3m4!1s0x40b35b986217beaf:0x9481540eeaad8c5b!8m2!3d45.6588439!4d25.5875091?hl=ro&authuser=0");
            }
        });
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://glovoapp.com/ro/ro/brasov/casa-avram-iancu/");
            }
        });
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://casaavramiancu.ro/s/2?lat=45.6588439&lng=25.5875091&view=true");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}