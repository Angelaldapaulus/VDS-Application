package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class materisatthi extends AppCompatActivity implements View.OnClickListener {
    Button sejarahbuddhaintent;
    Button teoridhammakathina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materisatthi);
        sejarahbuddhaintent = (Button)findViewById(R.id.sejarahbuddha);
        sejarahbuddhaintent.setOnClickListener(this);
        teoridhammakathina = (Button)findViewById(R.id.teoridhammakathina);
        teoridhammakathina.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sejarahbuddha:
                Intent sejarahbuddha = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tAA06BV3Ekcz62JtErliIFigjjcAGJur/view?usp=sharing"));
                startActivity(sejarahbuddha);
                break;
            case R.id.teoridhammakathina:
                Intent teoridhammakathina = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1cfb0QEaZrfBccgWwnOCoritg96s6SV3f/edit?usp=sharing&ouid=101188777282539998841&rtpof=true&sd=true"));
                startActivity(teoridhammakathina);
                break;
            default:
                break;
        }
    }
}