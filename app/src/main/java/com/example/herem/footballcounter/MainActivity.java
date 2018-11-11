package com.example.herem.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Set variable for Team A score
    int scoreTeamA = 0;

    //Set variable for Team B score
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increase Team A score by 1 for Field Goal
    public void fieldGoalTeamA(View view) {
        ++scoreTeamA;
        displayForTeamA(scoreTeamA);
    }

    //Increase Team A score by 2 for Safety
    public void safetyTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Increase Team A score by 6 for Touchdown
    public void touchdownTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    //Increase Team A score by 2 for Extra Point Attempt
    public void extraPointTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Increase Team B score by 1 for Field Goal
    public void fieldGoalTeamB(View view) {
        ++scoreTeamB;
        displayForTeamB(scoreTeamB);
    }

    //Increase Team B score by 2 for Safety
    public void safetyTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //Increase Team B score by 6 for Touchdown
    public void touchdownTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    //Increase Team B score by 2 for Extra Point Attempt
    public void extraPointTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //Reset Team A and Team B scores to 0
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_Score_TestView);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_Score_TestView);
        scoreView.setText(String.valueOf(score));
    }
}