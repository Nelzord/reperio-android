package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Shrimp_Scampi extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrimp__scampi);
        TextView textView = findViewById(R.id.text);
        textView.setText(R.string.ShrimpScampi);


    }
}