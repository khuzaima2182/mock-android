package com.example.mocktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class TF extends AppCompatActivity {
    Button bt43;
    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tf);
        tv1 = findViewById(R.id.textView32);
        tv2 = findViewById(R.id.textView33);
        tv3 = findViewById(R.id.textView34);
        tv4 = findViewById(R.id.textView35);
        tv5 = findViewById(R.id.textView36);
        bt43 = findViewById(R.id.bt2);


    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton4:
                if (checked)
                    tv1.setText("Correct");
                break;
            case R.id.radioButton3:
                if (checked)
                    tv1.setText("Incorrect");

                break;
        }
        switch (view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    tv2.setText("Incorrect");

                break;
            case R.id.radioButton6:
                if (checked)
                    tv2.setText("Correct");

                break;

        }

        switch (view.getId()) {
            case R.id.radioButton9:
                if (checked)
                    tv3.setText("Correct");

                break;
            case R.id.radioButton10:
                if (checked)
                    tv3.setText("Inorrect");
                break;

        }

        switch (view.getId()) {
            case R.id.radioButton13:
                if (checked)
                    tv4.setText("Correct");

                break;
            case R.id.radioButton14:
                if (checked)
                    tv4.setText("Incorrect");

                break;

        }

        switch (view.getId()) {
            case R.id.radioButton17:
                if (checked)
                    tv5.setText("Correct");

                break;
            case R.id.radioButton18:
                if (checked)
                    tv5.setText("Inorrect");

                break;

        }
        bt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TF.this, Ques.class);
                startActivity(intent);
            }
        });
    }
}