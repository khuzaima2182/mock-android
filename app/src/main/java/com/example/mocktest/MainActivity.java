package com.example.mocktest;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView img;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView3);
        tv1 = findViewById(R.id.textView2);
        Animation animator = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        img.setVisibility(View.VISIBLE);
        tv1.setVisibility(View.VISIBLE);
        img.startAnimation(animator);
        tv1.startAnimation(animator);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, Ques.class);
                startActivity(intent);
                onBackPressed();
            }
        },3000);

    }
}