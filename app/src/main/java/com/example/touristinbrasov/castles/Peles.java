package com.example.touristinbrasov.castles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Peles extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peles);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Castelul+Peleș/@45.3602412,25.5387546,17z/data=!4m9!1m2!2m1!1speles+castle!3m5!1s0x40b316ecd2e0556d:0x9a6e63a594f3d5ad!8m2!3d45.3599816!4d25.5426423!15sCgxwZWxlcyBjYXN0bGVaDiIMcGVsZXMgY2FzdGxlkgEGY2FzdGxlmgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVVJWTVdKcFZYQlJSUkFC");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}