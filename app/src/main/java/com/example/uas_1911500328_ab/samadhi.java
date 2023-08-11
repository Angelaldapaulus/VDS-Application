package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class samadhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samadhi);
    }

    public void parittasamadhi(View view) {startActivity(new Intent(samadhi.this, parittasamadhi.class));
    }

    public void materisamadhi(View view) {startActivity(new Intent(samadhi.this, materisamadhi.class));
    }
}