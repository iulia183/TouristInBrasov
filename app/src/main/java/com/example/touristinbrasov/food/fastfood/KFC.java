package com.example.touristinbrasov.food.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class KFC extends AppCompatActivity {

    Button map;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);

        map = findViewById(R.id.map);
        order = findViewById(R.id.order);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/search/KFC/@45.6563832,25.5835516,13z/data=!3m1!4b1?hl=ro&authuser=0");
            }
        });
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://glovoapp.com/ro/ro/brasov/kfc-brv/");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}