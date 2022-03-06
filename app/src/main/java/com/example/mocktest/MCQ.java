package com.example.mocktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MCQ extends AppCompatActivity {
RadioButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;
TextView tv1,tv2,tv3,tv4,tv5;
Button bt43;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);
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
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    tv1.setText("Incorrect");

                    break;
            case R.id.radioButton2:
                if (checked)
                    tv1.setText("Incorrect");

                    break;

            case R.id.radioButton4:
                if(checked)
                    tv1.setText("Correct");
                break;
            case R.id.radioButton3:
                if(checked)
                    tv1.setText("Incorrect");
                break;
        }
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    tv2.setText("Incorrect");

                break;
            case R.id.radioButton6:
                if (checked)
                    tv2.setText("Correct");

                break;
            case R.id.radioButton7:
                if(checked)
                    tv2.setText("Incorrect");
                break;
            case R.id.radioButton8:
                if(checked)
                    tv2.setText("Incorrect");
                break;
        }

        switch(view.getId()) {
            case R.id.radioButton9:
                if (checked)
                    tv3.setText("Correct");

                break;
            case R.id.radioButton10:
                if (checked)
                    tv3.setText("Inorrect");

                break;
            case R.id.radioButton11:
                if(checked)
                    tv3.setText("Incorrect");
                break;
            case R.id.radioButton12:
                if(checked)
                    tv3.setText("Incorrect");
                break;
        }

        switch(view.getId()) {
            case R.id.radioButton13:
                if (checked)
                    tv4.setText("Correct");

                break;
            case R.id.radioButton14:
                if (checked)
                    tv4.setText("Incorrect");

                break;
            case R.id.radioButton15:
                if(checked)
                    tv4.setText("Incorrect");
                break;
            case R.id.radioButton16:
                if(checked)
                    tv4.setText("Incorrect");
                break;
        }

        switch(view.getId()) {
            case R.id.radioButton17:
                if (checked)
                    tv5.setText("Correct");

                break;
            case R.id.radioButton18:
                if (checked)
                    tv5.setText("Inorrect");

                break;
            case R.id.radioButton19:
                if(checked)
                    tv5.setText("Incorrect");
                break;
            case R.id.radioButton20:
                if(checked)
                    tv5.setText("Incorrect");
                break;
        }
        bt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MCQ.this,Ques.class);
                startActivity(intent);
            }
        });
    }


}