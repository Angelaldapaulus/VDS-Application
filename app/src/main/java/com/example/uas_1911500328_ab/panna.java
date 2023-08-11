package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class panna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panna);
    }

    public void parittapanna(View view) {startActivity(new Intent(panna.this, parittapanna.class));
    }

    public void materipanna(View view) {startActivity(new Intent(panna.this, materipanna.class));
    }
}