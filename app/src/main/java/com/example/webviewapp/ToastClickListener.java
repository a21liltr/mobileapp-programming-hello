package com.example.webviewapp;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastClickListener implements View.OnClickListener {
    private int count;
    private TextView textView;

    public ToastClickListener(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {

        Context context = v.getContext();
        CharSequence text = "You look sweet!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        count++;
        this.textView.setText("You are " + String.valueOf(count) + " x sweeter than chocolate!");

        System.out.println("Click!");
    }
}
