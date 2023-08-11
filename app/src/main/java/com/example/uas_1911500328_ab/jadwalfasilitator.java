package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jadwalfasilitator extends AppCompatActivity implements View.OnClickListener {
    Button jadwaljanuariintent;
    Button jadwalfebruariintent;
    Button jadwalmaretintent;
    Button jadwalaprilintent;
    Button jadwalmeiintent;
    Button jadwaljuniintent;
    Button jadwaljuliintent;
    Button jadwalagustusintent;
    Button jadwalseptemberintent;
    Button jadwaloktoberintent;
    Button jadwalnovemberintent;
    Button jadwaldesemberintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalfasilitator2);
        jadwaljanuariintent = (Button)findViewById(R.id.jadwaljanuari);
        jadwaljanuariintent.setOnClickListener(this);
        jadwalfebruariintent = (Button)findViewById(R.id.jadwalfebruari);
        jadwalfebruariintent.setOnClickListener(this);
        jadwalmaretintent = (Button)findViewById(R.id.jadwalmaret);
        jadwalmaretintent.setOnClickListener(this);
        jadwalaprilintent = (Button)findViewById(R.id.jadwalapril);
        jadwalaprilintent.setOnClickListener(this);
        jadwalmeiintent = (Button)findViewById(R.id.jadwalmei);
        jadwalmeiintent.setOnClickListener(this);
        jadwaljuniintent = (Button)findViewById(R.id.jadwaljuni);
        jadwaljuniintent.setOnClickListener(this);
        jadwaljuliintent = (Button)findViewById(R.id.jadwaljuli);
        jadwaljuliintent.setOnClickListener(this);
        jadwalagustusintent = (Button)findViewById(R.id.jadwalagustus);
        jadwalagustusintent.setOnClickListener(this);
        jadwalseptemberintent = (Button)findViewById(R.id.jadwalseptember);
        jadwalseptemberintent.setOnClickListener(this);
        jadwaloktoberintent = (Button)findViewById(R.id.jadwaloktober);
        jadwaloktoberintent.setOnClickListener(this);
        jadwalnovemberintent = (Button)findViewById(R.id.jadwalnovember);
        jadwalnovemberintent.setOnClickListener(this);
        jadwaldesemberintent = (Button)findViewById(R.id.jadwaldesember);
        jadwaldesemberintent.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.jadwaljanuari:
                Intent jadwaljanuari = new Intent(jadwalfasilitator.this, jadwaljanuari.class);
                startActivity(jadwaljanuari);
                break;
            case R.id.jadwalfebruari:
                Intent jadwalfebruari = new Intent(jadwalfasilitator.this, jadwalfebruari.class);
                startActivity(jadwalfebruari);
                break;
            case R.id.jadwalmaret:
                Intent jadwalmaret = new Intent(jadwalfasilitator.this, jadwalmaret.class);
                startActivity(jadwalmaret);
                break;
            case R.id.jadwalapril:
                Intent jadwalapril = new Intent(jadwalfasilitator.this, jadwalapril.class);
                startActivity(jadwalapril);
                break;
            case R.id.jadwalmei:
                Intent jadwalmei = new Intent(jadwalfasilitator.this, jadwalmei.class);
                startActivity(jadwalmei);
                break;
            case R.id.jadwaljuni:
                Intent jadwaljuni = new Intent(jadwalfasilitator.this, jadwaljuni.class);
                startActivity(jadwaljuni);
                break;
            case R.id.jadwaljuli:
                Intent jadwaljuli = new Intent(jadwalfasilitator.this, jadwaljuli.class);
                startActivity(jadwaljuli);
                break;
            case R.id.jadwalagustus:
                Intent jadwalagustus = new Intent(jadwalfasilitator.this, jadwalagustus.class);
                startActivity(jadwalagustus);
                break;
            case R.id.jadwalseptember:
                Intent jadwalseptember = new Intent(jadwalfasilitator.this, jadwalseptember.class);
                startActivity(jadwalseptember);
                break;
            case R.id.jadwaloktober:
                Intent jadwaloktober = new Intent(jadwalfasilitator.this, jadwaloktober.class);
                startActivity(jadwaloktober);
                break;
            case R.id.jadwalnovember:
                Intent jadwalnovember = new Intent(jadwalfasilitator.this, jadwalnovember.class);
                startActivity(jadwalnovember);
                break;
            case R.id.jadwaldesember:
                Intent jadwaldesember = new Intent(jadwalfasilitator.this, jadwaldesember.class);
                startActivity(jadwaldesember);
                break;
            default:
                break;
        }
    }
}