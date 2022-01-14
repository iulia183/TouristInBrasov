package com.example.touristinbrasov.food.restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Tudor extends AppCompatActivity {

    Button map;
    Button order;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tudor);

        map = findViewById(R.id.map);
        order = findViewById(R.id.order);
        menu = findViewById(R.id.menu);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Casa+Tudor/@45.6570167,25.5871037,17z/data=!3m1!4b1!4m5!3m4!1s0x40b35b99229135fb:0x9775b815cc60215!8m2!3d45.6570167!4d25.5892925?hl=ro&authuser=0");
            }
        });
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://glovoapp.com/ro/ro/brasov/casa-tudor-brv-/");
            }
        });
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1wnYASUL5G-XE7d_Desd21cqkOschHH6K/view?usp=sharing");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}