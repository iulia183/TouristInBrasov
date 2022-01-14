package com.example.touristinbrasov.museums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class MuseumHistory extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_history);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Muzeul+Jude%C8%9Bean+de+Istorie/@45.6404598,25.5805224,15z/data=!4m9!1m2!2m1!1smuzeul+de+istorie+brasov!3m5!1s0x40b35b7ea404cda7:0xeeace9eb0998864c!8m2!3d45.644139!4d25.5973503!15sChhtdXpldWwgZGUgaXN0b3JpZSBicmFzb3aSAQZtdXNldW0?hl=ro");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}