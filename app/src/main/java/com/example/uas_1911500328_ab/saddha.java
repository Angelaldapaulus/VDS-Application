package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saddha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saddha);
    }

    public void parittasaddha(View view) {startActivity(new Intent(saddha.this, parittasaddha.class));
    }

    public void materisaddha(View view) {startActivity((new Intent(saddha.this, materisaddha.class)));
    }
}