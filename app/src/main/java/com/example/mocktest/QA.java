package com.example.mocktest;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QA extends AppCompatActivity {
Button bt1;
int index = 0;
Button bt2;
Button bt3;
Button bt4;
TextView tv1;
TextView tv2;
TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa);
        bt1 = findViewById(R.id.button2);
        bt2 = findViewById(R.id.button6);
        bt3 = findViewById(R.id.button7);
        bt4 =findViewById(R.id.button3);
        tv1 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView4);
        tv3 = findViewById(R.id.textView6);


        Resources res = getResources();
        String[] ques = ((Resources) res).getStringArray(R.array.ques);
        String[] answer = ((Resources) res).getStringArray(R.array.Answers);
        tv2.setText(ques[index]);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                tv3.setText(" ");

                index--;
                tv2.setText(ques[index]);
                tv1.setText(String.valueOf(index+1)+ "/" + " 10" );
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                tv3.setText(answer[index]);
                tv1.setText(String.valueOf(index+1) + "/" + " 10");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                tv3.setText(" ");
                index++;
                tv2.setText(ques[index]);
                tv1.setText(String.valueOf(index+1)+ "/" + " 10");
                if (index == 9)
                {
                    index = 0;
                    Toast.makeText(QA.this, "Press Back to Main Page", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QA.this, "Back To Main Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QA.this,Ques.class);
                index = 0;
                startActivity(intent);

            }
        });


    }
}