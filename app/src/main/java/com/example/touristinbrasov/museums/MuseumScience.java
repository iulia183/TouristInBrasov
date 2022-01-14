package com.example.touristinbrasov.museums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class MuseumScience extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_science);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.ro/maps/place/Muzeul+Interactiv+de+%C8%98tiin%C8%9Be+Bra%C8%99ov/@45.6477074,25.6023382,17z/data=!3m1!4b1!4m5!3m4!1s0x40b35bba05fe8445:0x6757d2bb23bf67e7!8m2!3d45.6477037!4d25.6045269?hl=ro");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
