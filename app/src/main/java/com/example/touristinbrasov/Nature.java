package com.example.touristinbrasov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.touristinbrasov.castles.Bran;
import com.example.touristinbrasov.castles.Cantacuzino;
import com.example.touristinbrasov.castles.Peles;
import com.example.touristinbrasov.castles.Rasnov;
import com.example.touristinbrasov.castles.Rupea;

public class Nature extends AppCompatActivity implements View.OnClickListener {

    private CardView tampa;
    private CardView prapastii;
    private CardView bucegi;
    private CardView noua;
    private CardView racos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        tampa = (CardView) findViewById(R.id.cardView);
        prapastii = (CardView) findViewById(R.id.cardView3);
        bucegi = (CardView) findViewById(R.id.cardView4);
        noua = (CardView) findViewById(R.id.cardView5);
        racos = (CardView) findViewById(R.id.cardView6);

        tampa.setOnClickListener(this);
        prapastii.setOnClickListener(this);
        bucegi.setOnClickListener(this);
        noua.setOnClickListener(this);
        racos.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardView:
                gotoUrl("https://www.google.ro/maps/place/T%C3%A2mpa/@45.6340837,25.5840924,15z/data=!3m1!4b1!4m5!3m4!1s0x40b35b61e51e4dc7:0xa82ef9504a68e005!8m2!3d45.6340695!4d25.5928472?hl=ro");
                break;
            default:break;
        }
        switch (v.getId()) {
            case R.id.cardView3:
                gotoUrl("https://www.google.ro/maps/place/Prapastiile+Zarnestiului/@45.5283528,25.2644928,17z/data=!3m1!4b1!4m5!3m4!1s0x40b349e1a7c826f3:0x493ad2c6fcf5a64a!8m2!3d45.5283491!4d25.2666815?hl=ro");
                break;
            default:break;
        }
        switch (v.getId()) {
            case R.id.cardView4:
                gotoUrl("https://www.google.ro/maps/place/Sfinxul+Bucegi/@45.4083162,25.4681238,17z/data=!4m5!3m4!1s0x40b33e6d73fdaabd:0xc8c1b97eb6e83483!8m2!3d45.4083125!4d25.4703125?hl=ro");
                break;
            default:break;
        }
        switch (v.getId()) {
            case R.id.cardView5:
                gotoUrl("https://www.google.ro/maps/place/Lacul+Noua/@45.6136984,25.6387389,18z/data=!3m1!4b1!4m5!3m4!1s0x40b35d20b3e2db8f:0x76da0f500eaa4312!8m2!3d45.6139734!4d25.6393695?hl=ro");
                break;
            default:break;
        }
        switch (v.getId()) {
            case R.id.cardView6:
                gotoUrl("https://www.google.ro/maps/place/Raco%C8%99+507175/@46.024962,25.4006319,14z/data=!3m1!4b1!4m5!3m4!1s0x474b4eefe03beb6b:0xfe70ff12f41ade1f!8m2!3d46.0236232!4d25.4140644?hl=ro");
                break;
            default:break;
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}