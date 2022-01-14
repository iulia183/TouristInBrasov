package com.example.touristinbrasov.food.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Meron extends AppCompatActivity {

    Button map;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meron);

        map = findViewById(R.id.map);
        order = findViewById(R.id.order);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Meron+Bra%C8%99ov/@45.5811448,22.5706805,7z/data=!4m9!1m2!2m1!1smeron!3m5!1s0x40b35b5f91e4aa93:0xf0cf98081185e2da!8m2!3d45.6439376!4d25.5905756!15sCgVtZXJvbiIDiAEBWgciBW1lcm9ukgELY29mZmVlX3Nob3A?hl=ro&authuser=0");
            }
        });
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://glovoapp.com/ro/ro/brasov/meron-brv/");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}