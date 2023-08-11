package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cagga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cagga);

    }

    public void parittacagga(View view) {startActivity(new Intent(cagga.this, parittacagga.class));
    }

    public void matericagga(View view) {startActivity((new Intent(cagga.this, matericagga.class)));
    }
}