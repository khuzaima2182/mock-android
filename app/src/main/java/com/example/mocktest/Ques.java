package com.example.mocktest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ques extends AppCompatActivity {
Button bt1;
Button bt2;
Button bt3;
Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);
        bt1 = findViewById(R.id.button5);
        bt2 = findViewById(R.id.button8);
        bt3 = findViewById(R.id.button9);
        bt4 = findViewById(R.id.button);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ques.this, QA.class);
                startActivity(intent);

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ques.this,MCQ.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ques.this,TF.class);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/training/basics/intents/sending"));
                startActivity(browserIntent);
            }
        });
    }
}