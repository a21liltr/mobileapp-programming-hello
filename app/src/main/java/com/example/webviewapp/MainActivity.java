package com.example.webviewapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button btnSweet;
    TextView viewCount;
    ToastClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSweet = findViewById(R.id.btn_sweet);
        viewCount = findViewById(R.id.count);

        listener = new ToastClickListener(viewCount);
        btnSweet.setOnClickListener(listener);
    }

}
