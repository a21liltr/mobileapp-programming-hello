package com.example.webviewapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button btnCute;
    TextView viewCount;
    ToastClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnCute = findViewById(R.id.btn_cute);
        viewCount = findViewById(R.id.count);

        listener = new ToastClickListener(viewCount);
        btnCute.setOnClickListener(listener);
    }

}
