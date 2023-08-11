package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class satthi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satthi);
    }

    public void parittasatthi(View view) {startActivity(new Intent(satthi.this, parittasatthi.class));
    }

    public void materisatthi(View view) {startActivity(new Intent(satthi.this, materisatthi.class));
    }
}