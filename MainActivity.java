package com.meass.wifiprintersection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seupconnection(View view) {
        Toast.makeText(this, "AAAAAAAAA", Toast.LENGTH_SHORT).show();
    }
}