package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viriya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viriya);
    }

    public void parittaviriya(View view) {startActivity(new Intent(viriya.this, parittaviriya.class));
    }

    public void materiviriya(View view) {startActivity(new Intent(viriya.this, materiviriya.class));
    }
}