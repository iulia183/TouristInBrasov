package com.example.touristinbrasov.food.restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Sergiana extends AppCompatActivity {

    Button map;
    Button order;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sergiana);

        map = findViewById(R.id.map);
        order = findViewById(R.id.order);
        menu = findViewById(R.id.menu);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Sergiana/@45.6452304,25.5876372,17z/data=!3m1!4b1!4m5!3m4!1s0x40b35b7a04996fc5:0xdd1ebaf6db73b685!8m2!3d45.6452304!4d25.5898259?hl=ro&authuser=0");
            }
        });
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://glovoapp.com/ro/ro/brasov/sergiana/");
            }
        });
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1FdRpKoH8UojyPQewWOjMiW8f8ZoO8ARw/view?usp=sharing");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}