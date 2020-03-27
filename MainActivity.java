package com.example.fungsiintent;

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

    public void panggil(View view){
        String nomor = "08843893823";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view){
        String url = "https://night0code.blogspot.com";
        Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
        bukaBrowser.setData(Uri.parse(url));
        startActivity(bukaBrowser);
    }

    public void tentang(View view){
        Intent tentang = new Intent(MainActivity.this, activity_tentang.class);
        startActivity(tentang);
    }
}