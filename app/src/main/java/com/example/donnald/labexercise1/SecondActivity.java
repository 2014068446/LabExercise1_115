package com.example.donnald.labexercise1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView rawaverage;
    TextView finalgrade;
    Button btnBack;
    String finalgradeoutput = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rawaverage = (TextView) findViewById(R.id.txt_rawAverage);
        finalgrade = (TextView) findViewById(R.id.txt_finalGrade);
        btnBack = (Button) findViewById(R.id.btnReturn);

        int quiz1 = getIntent().getExtras().getInt("quiz1");
        int quiz2 = getIntent().getExtras().getInt("quiz2");
        int seatwork = getIntent().getExtras().getInt("seatwork");
        int labexer = getIntent().getExtras().getInt("labexer");
        int majorexam = getIntent().getExtras().getInt("majorexam");

        double raw = (quiz1 * .10) + (quiz2 * .10) + (seatwork * .10) + (labexer * .40) + (majorexam * .30);
        if (raw < 60) {
            finalgradeoutput = "FAILED";
        }
        else if (raw <= 65) {
            finalgradeoutput = "3.0";
        }
        else if (raw <= 70) {
            finalgradeoutput = "2.75";
        }
        else if (raw <= 75) {
            finalgradeoutput = "2.5";
        }
        else if (raw <= 80) {
            finalgradeoutput = "2.25";
        }
        else if (raw <= 85) {
            finalgradeoutput = "2.0";
        }
        else if (raw <= 90) {
            finalgradeoutput = "1.75";
        }
        else if (raw <= 92) {
            finalgradeoutput = "1.5";
        }
        else if (raw <= 94) {
            finalgradeoutput = "1.25";
        }
        else if (raw == 100) {
            finalgradeoutput = "1.25";
        }

        String rawoutput = Double.toString(raw);

        rawaverage.setText(rawoutput);
        finalgrade.setText(finalgradeoutput);

    }
    public void returnToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
