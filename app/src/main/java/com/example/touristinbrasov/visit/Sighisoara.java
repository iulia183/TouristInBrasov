package com.example.touristinbrasov.visit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Sighisoara extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sighisoara);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Sighi%C8%99oara/@46.2230599,24.7586876,13z/data=!3m1!4b1!4m5!3m4!1s0x474b74f2e6637e5b:0x7b12e0094163247f!8m2!3d46.2197025!4d24.7963878?hl=ro");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}