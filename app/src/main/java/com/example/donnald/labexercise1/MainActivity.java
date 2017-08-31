package com.example.donnald.labexercise1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText quiz1;
    EditText quiz2;
    EditText seatwork;
    EditText labexer;
    EditText majorexam;

    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quiz1 = (EditText) findViewById(R.id.in_quiz1);
        quiz2 = (EditText) findViewById(R.id.in_quiz2);
        seatwork = (EditText) findViewById(R.id.in_seatWork);
        labexer = (EditText) findViewById(R.id.in_labExer);
        majorexam = (EditText) findViewById(R.id.in_majorExam);
        btnNext = (Button) findViewById(R.id.btnNext);


    }
    public void callSecondActivity (View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("quiz1", Integer.parseInt(quiz1.getText().toString()));  // getText returns object
        intent.putExtra("quiz2", Integer.parseInt(quiz2.getText().toString()));
        intent.putExtra("seatwork", Integer.parseInt(seatwork.getText().toString()));
        intent.putExtra("labexer", Integer.parseInt(labexer.getText().toString()));
        intent.putExtra("majorexam", Integer.parseInt(majorexam.getText().toString()));

        startActivity(intent);
    }
}
