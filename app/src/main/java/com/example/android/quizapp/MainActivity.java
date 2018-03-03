package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays an quiz for Android App Course.
 */
public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizSummary(View view) {
        /*
          Check all selected checkboxes status
         */
        RadioButton q1answer2Checkbox = findViewById(R.id.q1answer2_checkbox);
        boolean q1answer2selected = q1answer2Checkbox.isChecked();

        CheckBox q2answer1Checkbox = findViewById(R.id.q2answer1_checkbox);
        boolean q2answer1selected = q2answer1Checkbox.isChecked();
        CheckBox q2answer2Checkbox = findViewById(R.id.q2answer2_checkbox);
        boolean q2answer2selected = q2answer2Checkbox.isChecked();
        CheckBox q2answer3Checkbox = findViewById(R.id.q2answer3_checkbox);
        boolean q2answer3selected = q2answer3Checkbox.isChecked();

        RadioButton q3answer2Checkbox = findViewById(R.id.q3answer2_checkbox);
        boolean q3answer2selected = q3answer2Checkbox.isChecked();

        RadioButton q4answer3Checkbox = findViewById(R.id.q4answer3_checkbox);
        boolean q4answer3selected = q4answer3Checkbox.isChecked();

        RadioButton q6answer1Checkbox = findViewById(R.id.q6answer1_checkbox);
        boolean q6answer1selected = q6answer1Checkbox.isChecked();

        RadioButton q7answer1Checkbox = findViewById(R.id.q7answer1_checkbox);
        boolean q7answer1selected = q7answer1Checkbox.isChecked();

        RadioButton q8answer2Checkbox = findViewById(R.id.q8answer2_checkbox);
        boolean q8answer2selected = q8answer2Checkbox.isChecked();

        RadioButton q9answer4Checkbox = findViewById(R.id.q9answer4_checkbox);
        boolean q9answer4selected = q9answer4Checkbox.isChecked();

        RadioButton q10answer1Checkbox = findViewById(R.id.q10answer1_checkbox);
        boolean q10answer1selected = q10answer1Checkbox.isChecked();

        /*
        * Add points if correct answer was given
        **/

        if (q1answer2selected) {
            correctAnswers = correctAnswers + 1;
//            String question1selection = "Correct!";
        }

        if (q2answer1selected) {
            if (q2answer2selected) {
                if (q2answer3selected) {
                    correctAnswers = correctAnswers + 1;
//                    String question2selection = "Correct!";
                }
            }
        }

        if (q3answer2selected) {
            correctAnswers = correctAnswers + 1;
//            String question3selection = "Correct!";
        }

        if (q4answer3selected) {
            correctAnswers = correctAnswers + 1;
//            String question4selection = "Correct!";
        }

        EditText q5answerTextfield = findViewById(R.id.q5answer_textfield);
        String q5answer_answer = q5answerTextfield.getText().toString();
        if (q5answer_answer.trim().length() > 0) {
            if (q5answer_answer.equals("T-Mobile G1")) {
                correctAnswers = correctAnswers + 1;
//            String question5selection = "Correct!";
            }
        }

        if (q6answer1selected) {
            correctAnswers = correctAnswers + 1;
//            String question6selection = "Correct!";
        }

        if (q7answer1selected) {
            correctAnswers = correctAnswers + 1;
//            String question7selection = "Correct!";
        }

        if (q8answer2selected) {
            correctAnswers = correctAnswers + 1;
//            String question8selection = "Correct!";
        }

        if (q9answer4selected) {
            correctAnswers = correctAnswers + 1;
//            String question9selection = "Correct!";
        }

        if (q10answer1selected) {
            correctAnswers = correctAnswers + 1;
//            String question10selection = "Correct!";
        }

        Toast.makeText(this, "You've finished the quiz! Correct answers: " + correctAnswers, Toast.LENGTH_LONG).show();

//        if (view.getId() == R.id.summary_button) {
        Button summaryButton;
        summaryButton = findViewById(R.id.summary_button);
        summaryButton.setEnabled(false);
//        }
    }

    /**
     * Reset the score for both teams A and B.
     */

    public void resetScore(View v) {
        correctAnswers = 0;
        Button summaryButton = findViewById(R.id.summary_button);
        summaryButton.setEnabled(true);
    }

}