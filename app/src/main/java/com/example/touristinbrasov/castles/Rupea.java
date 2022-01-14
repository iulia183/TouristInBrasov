package com.example.touristinbrasov.castles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Rupea extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupea);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Cetatea+Rupea/@46.0371773,25.2100469,17z/data=!3m1!4b1!4m5!3m4!1s0x474b44a764d41ee1:0x5624102bbd0bf303!8m2!3d46.0371773!4d25.2122356");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}