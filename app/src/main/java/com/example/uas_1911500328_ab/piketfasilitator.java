package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class piketfasilitator extends AppCompatActivity implements View.OnClickListener {
    Button piketjanuariintent;
    Button piketfebruariintent;
    Button piketmaretintent;
    Button piketaprilintent;
    Button piketjuniintent;
    Button piketjuliintent;
    Button piketagustusintent;
    Button piketseptemberintent;
    Button piketoktoberintent;
    Button piketnovemberintent;
    Button piketdesemberintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piketfasilitator);
        piketjanuariintent = (Button)findViewById(R.id.piketjanuari);
        piketjanuariintent.setOnClickListener(this);
        piketfebruariintent = (Button)findViewById(R.id.piketfebruari);
        piketfebruariintent.setOnClickListener(this);
        piketmaretintent = (Button)findViewById(R.id.piketmaret);
        piketmaretintent.setOnClickListener(this);
        piketaprilintent = (Button)findViewById(R.id.piketapril);
        piketaprilintent.setOnClickListener(this);
        piketjuniintent = (Button)findViewById(R.id.piketjuni);
        piketjuniintent.setOnClickListener(this);
        piketjuliintent = (Button)findViewById(R.id.piketjuli);
        piketjuliintent.setOnClickListener(this);
        piketagustusintent = (Button)findViewById(R.id.piketagustus);
        piketagustusintent.setOnClickListener(this);
        piketseptemberintent = (Button)findViewById(R.id.piketseptember);
        piketseptemberintent.setOnClickListener(this);
        piketoktoberintent = (Button)findViewById(R.id.piketoktober);
        piketoktoberintent.setOnClickListener(this);
        piketnovemberintent = (Button)findViewById(R.id.piketnovember);
        piketnovemberintent.setOnClickListener(this);
        piketdesemberintent = (Button)findViewById(R.id.piketdesember);
        piketdesemberintent.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.piketjanuari:
                Intent piketjanuari = new Intent(piketfasilitator.this, piketjanuari.class);
                startActivity(piketjanuari);
                break;
            case R.id.piketfebruari:
                Intent piketfebruari = new Intent(piketfasilitator.this, piketfebruari.class);
                startActivity(piketfebruari);
                break;
            case R.id.piketmaret:
                Intent piketmaret = new Intent(piketfasilitator.this, piketmaret.class);
                startActivity(piketmaret);
                break;
            case R.id.piketapril:
                Intent piketapril = new Intent(piketfasilitator.this, piketapril.class);
                startActivity(piketapril);
                break;
            case R.id.piketmei:
                Intent piketmei = new Intent(piketfasilitator.this, piketmei.class);
                startActivity(piketmei);
                break;
            case R.id.piketjuni:
                Intent piketjuni = new Intent(piketfasilitator.this, piketjuni.class);
                startActivity(piketjuni);
                break;
            case R.id.piketjuli:
                Intent piketjuli = new Intent(piketfasilitator.this, piketjuli.class);
                startActivity(piketjuli);
                break;
            case R.id.piketagustus:
                Intent piketagustus = new Intent(piketfasilitator.this, piketagustus.class);
                startActivity(piketagustus);
                break;
            case R.id.piketseptember:
                Intent piketseptember = new Intent(piketfasilitator.this, piketseptember.class);
                startActivity(piketseptember);
                break;
            case R.id.piketoktober:
                Intent piketoktober = new Intent(piketfasilitator.this, piketoktober.class);
                startActivity(piketoktober);
                break;
            case R.id.piketnovember:
                Intent piketnovember = new Intent(piketfasilitator.this, piketnovemberr.class);
                startActivity(piketnovember);
                break;
            case R.id.piketdesember:
                Intent piketdesember = new Intent(piketfasilitator.this, piketdesember.class);
                startActivity(piketdesember);
                break;
            default:
                break;
        }
    }
}