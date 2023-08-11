package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private  void goToUrl (String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent. ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void fasilitatorr(View view) {
        startActivity(new Intent(MainActivity.this, fasilitatorr.class));
    }

    public void murid(View view) {startActivity(new Intent(MainActivity.this, murid.class));
    }

    public void facebook(View view) { goToUrl("https://www.facebook.com/vihara.sabha");
    }

    public void instagram(View view) { goToUrl("https://instagram.com/attasammapanidhi?utm_medium=copy_link");
    }
}