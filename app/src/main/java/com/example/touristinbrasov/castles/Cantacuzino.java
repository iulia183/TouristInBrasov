package com.example.touristinbrasov.castles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristinbrasov.R;

public class Cantacuzino extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantacuzino);

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps?client=opera&q=Cantacuzino+Castle&oe=UTF-8&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjImqaGg6X1AhU5hv0HHXVYAtUQ_AUoAnoECAIQBA");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}