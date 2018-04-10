package com.example.android.finalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called and scored when the Submit Button is clicked
     */

    public int questionOne() {
        RadioButton answerOne = findViewById(R.id.q1_a1);

        if (answerOne.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionTwo() {
        RadioButton answerTwo = findViewById(R.id.q2_a2);

        if (answerTwo.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionThree() {
        RadioButton answerThree = findViewById(R.id.q3_a2);

        if (answerThree.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionFour() {
        RadioButton answerFour = findViewById(R.id.q4_a1);

        if (answerFour.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionFive() {
        RadioButton answerFive = findViewById(R.id.q5_a1);
        if (answerFive.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionSix() {
        RadioButton answerSix = findViewById(R.id.q6_a3);

        if (answerSix.isChecked()) {
            score = 1;
        } else score = 0;
        return score;
    }

    public int questionSeven() {
        CheckBox checkBoxOne = findViewById(R.id.q7_a1);
        boolean q7_a1CheckBox = checkBoxOne.isChecked();
        CheckBox checkBoxTwo = findViewById(R.id.q7_a2);
        boolean q7_a2CheckBox = checkBoxTwo.isChecked();
        CheckBox checkBoxThree = findViewById(R.id.q7_a3);
        boolean q7_a3CheckBox = checkBoxThree.isChecked();
        CheckBox checkBoxFour = findViewById(R.id.q7_a4);
        boolean q7_a4CheckBox = checkBoxFour.isChecked();

        if (q7_a1CheckBox & q7_a2CheckBox) {
            score = 1;
        } else score = 0;
        return score;
    }
public int questionEight(){
    EditText answerEight = findViewById(R.id.q8_a);
    String getAnswer = answerEight.getText().toString();
    if(getAnswer.equals("Indiana")){
      score = 1;
    } else score = 0;
    return score;
}
            public void checkScore(View view){
            score = (questionOne()+ questionTwo()+ questionThree()+ questionFour()+ questionFive()+questionSix()+ questionSeven()+ questionEight());}


        public void reset(View view){
        Intent intent = getIntent();
        finish();
        startActivity(intent);

    }
}
