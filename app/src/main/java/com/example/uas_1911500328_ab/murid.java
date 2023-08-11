package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class murid extends AppCompatActivity implements View.OnClickListener {
    Button caggaintent;
    Button saddhaintent;
    Button viriyaintent;
    Button satthiintent;
    Button samadhiintent;
    Button pannaintent;
    Button nilaimuridintent;
    Button datamuridintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murid);

        caggaintent = (Button) findViewById(R.id.cagga);
        caggaintent.setOnClickListener(this);
        saddhaintent = (Button) findViewById(R.id.saddha);
        saddhaintent.setOnClickListener(this);
        viriyaintent = (Button) findViewById(R.id.viriya);
        viriyaintent.setOnClickListener(this);
        satthiintent = (Button) findViewById(R.id.satthi);
        satthiintent.setOnClickListener(this);
        samadhiintent = (Button) findViewById(R.id.samadhi);
        samadhiintent.setOnClickListener(this);
        pannaintent = (Button) findViewById(R.id.panna);
        pannaintent.setOnClickListener(this);
        nilaimuridintent = (Button) findViewById(R.id.nilaimurid);
        nilaimuridintent.setOnClickListener(this);
        datamuridintent = (Button) findViewById(R.id.datamurid);
        datamuridintent.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.cagga:
                Intent cagga = new Intent(murid.this, cagga.class);
                startActivity(cagga);
                break;
            case R.id.saddha:
                Intent saddha = new Intent(murid.this, saddha.class);
                startActivity(saddha);
                break;
            case R.id.viriya:
                Intent viriya = new Intent(murid.this, viriya.class);
                startActivity(viriya);
                break;
            case R.id.satthi:
                Intent satthi = new Intent(murid.this, satthi.class);
                startActivity(satthi);
                break;
            case R.id.samadhi:
                Intent samadhi = new Intent(murid.this, samadhi.class);
                startActivity(samadhi);
                break;
            case R.id.panna:
                Intent panna = new Intent(murid.this, panna.class);
                startActivity(panna);
                break;
            case R.id.nilaimurid:
                Intent nilaimurid = new Intent(murid.this, nilaimurid.class);
                startActivity(nilaimurid);
                break;
            case R.id.datamurid:
                Intent datamurid = new Intent(murid.this, datamurid.class);
                startActivity(datamurid);
                break;
            default:
                break;
        }
    }
}