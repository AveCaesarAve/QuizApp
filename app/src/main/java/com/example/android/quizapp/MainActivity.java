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

    int correctAnswers;
    int incorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizSummary(View view) {
        /*
         * Check all selected checkboxes status
         */
        RadioButton q1answer2Checkbox = findViewById(R.id.q1answer2_checkbox);
        boolean q1answer2selected = q1answer2Checkbox.isChecked();

        CheckBox q2answer1Checkbox = findViewById(R.id.q2answer1_checkbox);
        boolean q2answer1selected = q2answer1Checkbox.isChecked();
        CheckBox q2answer2Checkbox = findViewById(R.id.q2answer2_checkbox);
        boolean q2answer2selected = q2answer2Checkbox.isChecked();
        CheckBox q2answer3Checkbox = findViewById(R.id.q2answer3_checkbox);
        boolean q2answer3selected = q2answer3Checkbox.isChecked();
        CheckBox q2answer4Checkbox = findViewById(R.id.q2answer4_checkbox);
        boolean q2answer4selected = q2answer4Checkbox.isChecked();

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
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q2answer1selected && q2answer2selected && q2answer3selected && !q2answer4selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q3answer2selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q4answer3selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        EditText q5answerTextfield = findViewById(R.id.q5answer_textfield);
        String q5answer_answer = q5answerTextfield.getText().toString();
        if (q5answer_answer.trim().length() > 0) {
            if (q5answer_answer.equals("T-Mobile G1")) {
                correctAnswers = correctAnswers + 1;
            }
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q6answer1selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q7answer1selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q8answer2selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q9answer4selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        if (q10answer1selected) {
            correctAnswers = correctAnswers + 1;
        } else incorrectAnswers = incorrectAnswers + 1;

        Toast.makeText(this, "Finished!\nCorrect answers: " + correctAnswers + "\nIncorrect answers: " + incorrectAnswers, Toast.LENGTH_LONG).show();

        Button summaryButton;
        summaryButton = findViewById(R.id.summary_button);
        summaryButton.setEnabled(false);
    }

    /**
     * Reset the score for both teams A and B.
     */

    public void resetScore(View v) {
        correctAnswers = 0;
        incorrectAnswers = 0;
        Button summaryButton = findViewById(R.id.summary_button);
        summaryButton.setEnabled(true);

        /*
          Reset all checkboxes and Buttons states
         */
        RadioButton q1answer1Checkbox = findViewById(R.id.q1answer1_checkbox);
        q1answer1Checkbox.setChecked(false);
        RadioButton q1answer2Checkbox = findViewById(R.id.q1answer2_checkbox);
        q1answer2Checkbox.setChecked(false);
        RadioButton q1answer3Checkbox = findViewById(R.id.q1answer3_checkbox);
        q1answer3Checkbox.setChecked(false);
        RadioButton q1answer4Checkbox = findViewById(R.id.q1answer4_checkbox);
        q1answer4Checkbox.setChecked(false);

        CheckBox q2answer1Checkbox = findViewById(R.id.q2answer1_checkbox);
        q2answer1Checkbox.setChecked(false);
        CheckBox q2answer2Checkbox = findViewById(R.id.q2answer2_checkbox);
        q2answer2Checkbox.setChecked(false);
        CheckBox q2answer3Checkbox = findViewById(R.id.q2answer3_checkbox);
        q2answer3Checkbox.setChecked(false);
        CheckBox q2answer4Checkbox = findViewById(R.id.q2answer4_checkbox);
        q2answer4Checkbox.setChecked(false);

        RadioButton q3answer1Checkbox = findViewById(R.id.q3answer1_checkbox);
        q3answer1Checkbox.setChecked(false);
        RadioButton q3answer2Checkbox = findViewById(R.id.q3answer2_checkbox);
        q3answer2Checkbox.setChecked(false);
        RadioButton q3answer3Checkbox = findViewById(R.id.q3answer3_checkbox);
        q3answer3Checkbox.setChecked(false);
        RadioButton q3answer4Checkbox = findViewById(R.id.q3answer4_checkbox);
        q3answer4Checkbox.setChecked(false);

        RadioButton q4answer1Checkbox = findViewById(R.id.q4answer1_checkbox);
        q4answer1Checkbox.setChecked(false);
        RadioButton q4answer2Checkbox = findViewById(R.id.q4answer2_checkbox);
        q4answer2Checkbox.setChecked(false);
        RadioButton q4answer3Checkbox = findViewById(R.id.q4answer3_checkbox);
        q4answer3Checkbox.setChecked(false);
        RadioButton q4answer4Checkbox = findViewById(R.id.q4answer4_checkbox);
        q4answer4Checkbox.setChecked(false);

        EditText q5answerTextfield = findViewById(R.id.q5answer_textfield);
        q5answerTextfield.setText("");

        RadioButton q6answer1Checkbox = findViewById(R.id.q6answer1_checkbox);
        q6answer1Checkbox.setChecked(false);
        RadioButton q6answer2Checkbox = findViewById(R.id.q6answer2_checkbox);
        q6answer2Checkbox.setChecked(false);
        RadioButton q6answer3Checkbox = findViewById(R.id.q6answer3_checkbox);
        q6answer3Checkbox.setChecked(false);
        RadioButton q6answer4Checkbox = findViewById(R.id.q6answer4_checkbox);
        q6answer4Checkbox.setChecked(false);

        RadioButton q7answer1Checkbox = findViewById(R.id.q7answer1_checkbox);
        q7answer1Checkbox.setChecked(false);
        RadioButton q7answer2Checkbox = findViewById(R.id.q7answer2_checkbox);
        q7answer2Checkbox.setChecked(false);
        RadioButton q7answer3Checkbox = findViewById(R.id.q7answer3_checkbox);
        q7answer3Checkbox.setChecked(false);
        RadioButton q7answer4Checkbox = findViewById(R.id.q7answer4_checkbox);
        q7answer4Checkbox.setChecked(false);

        RadioButton q8answer1Checkbox = findViewById(R.id.q8answer1_checkbox);
        q8answer1Checkbox.setChecked(false);
        RadioButton q8answer2Checkbox = findViewById(R.id.q8answer2_checkbox);
        q8answer2Checkbox.setChecked(false);
        RadioButton q8answer3Checkbox = findViewById(R.id.q8answer3_checkbox);
        q8answer3Checkbox.setChecked(false);
        RadioButton q8answer4Checkbox = findViewById(R.id.q8answer4_checkbox);
        q8answer4Checkbox.setChecked(false);

        RadioButton q9answer1Checkbox = findViewById(R.id.q9answer1_checkbox);
        q9answer1Checkbox.setChecked(false);
        RadioButton q9answer2Checkbox = findViewById(R.id.q9answer2_checkbox);
        q9answer2Checkbox.setChecked(false);
        RadioButton q9answer3Checkbox = findViewById(R.id.q9answer3_checkbox);
        q9answer3Checkbox.setChecked(false);
        RadioButton q9answer4Checkbox = findViewById(R.id.q9answer4_checkbox);
        q9answer4Checkbox.setChecked(false);

        RadioButton q10answer1Checkbox = findViewById(R.id.q10answer1_checkbox);
        q10answer1Checkbox.setChecked(false);
        RadioButton q10answer2Checkbox = findViewById(R.id.q10answer2_checkbox);
        q10answer2Checkbox.setChecked(false);
        RadioButton q10answer3Checkbox = findViewById(R.id.q10answer3_checkbox);
        q10answer3Checkbox.setChecked(false);
        RadioButton q10answer4Checkbox = findViewById(R.id.q10answer4_checkbox);
        q10answer4Checkbox.setChecked(false);

    }

}