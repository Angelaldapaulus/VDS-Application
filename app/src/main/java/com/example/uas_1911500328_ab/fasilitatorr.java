package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fasilitatorr extends AppCompatActivity implements View.OnClickListener {
    Button datafasilitatorintent;
    Button piketfasilitatorintent;
    Button absenfasilitatorintent;
    Button jadwalfasilitatorintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitatorr);

        datafasilitatorintent = (Button) findViewById(R.id.datafasilitator);
        datafasilitatorintent.setOnClickListener(this);
        piketfasilitatorintent = (Button)findViewById(R.id.piketfasilitator);
        piketfasilitatorintent.setOnClickListener(this);
        absenfasilitatorintent = (Button)findViewById(R.id.absenfasilitator);
        absenfasilitatorintent.setOnClickListener(this);
        jadwalfasilitatorintent = (Button)findViewById(R.id.jadwalfasilitator);
        jadwalfasilitatorintent.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.datafasilitator:
                Intent datafasilitator = new Intent(fasilitatorr.this, datafasilitator.class);
                startActivity(datafasilitator);
                break;
            case R.id.piketfasilitator:
                Intent piketfasilitator = new Intent(fasilitatorr.this, piketfasilitator.class);
                startActivity(piketfasilitator);
                break;
            case R.id.absenfasilitator:
                Intent absenfasilitator = new Intent(fasilitatorr.this, absenfasilitator.class);
                startActivity(absenfasilitator);
                break;
            case R.id.jadwalfasilitator:
                Intent jadwalfasilitator = new Intent(fasilitatorr.this, jadwalfasilitator.class);
                startActivity(jadwalfasilitator);
                break;
            default:
            break;
        }
    }
}