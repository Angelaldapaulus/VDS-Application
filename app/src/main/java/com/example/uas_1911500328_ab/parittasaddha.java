package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parittasaddha extends AppCompatActivity implements View.OnClickListener {
    Button namakaragathaintent;
    Button pubbabhaganamakaraintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parittasaddha);
        namakaragathaintent = (Button)findViewById(R.id.namakaragatha);
        namakaragathaintent.setOnClickListener(this);
        pubbabhaganamakaraintent = (Button)findViewById(R.id.pubbabhaganamakara);
        pubbabhaganamakaraintent.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.namakaragatha:
                Intent namakaragatha = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1Xf2d0UpjeEopOqxQ7aV3tA8HkKF8DrS6/edit?usp=sharing&ouid=101188777282539998841&rtpof=true&sd=true"));
                startActivity(namakaragatha);
                break;
            case R.id.pubbabhaganamakara:
                Intent pubbabhaganamakara = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1duiAIXS0h3mF_CgVV-ctQLlS_3twVrxl/edit?usp=sharing&ouid=101188777282539998841&rtpof=true&sd=true"));
                startActivity(pubbabhaganamakara);
                break;
            default:
                break;
        }
    }
}