package com.example.android.championsleague;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA, scoreForTeamB, offsideTeamA, offsideTeamB,
        yellowCardTeamA, yellowCardTeamB, redCardTeamA, redCardTeamB,
        foulTeamA, foulTeamB, possessionTeamA, possessionTeamB,
        goalAttemptTeamA, goalAttemptTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * add score for team A
     * @param v
     */
    public void scoreForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * add score for team b
     * @param v
     */
    public void scoreForTeamB(View v) {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * add score for offside for team a
     * @param v
     */
    public void offsideTeamA(View v) {
        offsideTeamA = offsideTeamA + 1;
        displayForTeamAOffside(offsideTeamA);
    }

    /**
     * add score for offside for team b
     * @param v
     */
    public void offsideTeamB(View v) {
        offsideTeamB = offsideTeamB + 1;
        displayForTeamBOffside(offsideTeamB);
    }

    /**
     * add score for yellow card for team a
     * @param v
     */
    public void yellowCardTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayForTeamAYellowCard(yellowCardTeamA);
    }

    /**
     * add score for yellow card for team b
     * @param v
     */
    public void yellowCardTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayForTeamBYellowCard(yellowCardTeamB);
    }

    /**
     * add score for red card for team a
     * @param v
     */
    public void redCardTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayForTeamARedCard(redCardTeamA);
    }

    /**
     * add score for red card for team a
     * @param v
     */
    public void redCardTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        displayForTeamBRedCard(redCardTeamB);
    }

    /**
     * add score for fouls for team a
     * @param v
     */
    public void foulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayForTeamAFoul(foulTeamA);
    }

    /**
     * add score for fouls for team b
     * @param v
     */
    public void foulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayForTeamBFoul(foulTeamB);
    }

    /**
     * add score for possessions for team a
     * @param v
     */
    public void possessionTeamA(View v) {
        possessionTeamA = possessionTeamA + 1;
        displayForTeamAPossession(possessionTeamA);
    }

    /**
     * add score for possessions for team b
     * @param v
     */
    public void possessionTeamB(View v) {
        possessionTeamB = possessionTeamB + 1;
        displayForTeamBPossession(possessionTeamB);
    }

    /**
     * add score for goal attempts for team a
     * @param v
     */
    public void goalAttemptTeamA(View v) {
        goalAttemptTeamA = goalAttemptTeamA + 1;
        displayForTeamAGoalAttempt(goalAttemptTeamA);
    }

    /**
     * add score for goal attempts for team b
     * @param v
     */
    public void goalAttemptTeamB(View v) {
        goalAttemptTeamB = goalAttemptTeamB + 1;
        displayForTeamBGoalAttempt(goalAttemptTeamB);
    }

    /**
     * reset all scores
     */
    public void reset(View v) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        offsideTeamA = 0;
        offsideTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        possessionTeamA = 0;
        possessionTeamB = 0;
        goalAttemptTeamA = 0;
        goalAttemptTeamB = 0;

        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
        displayForTeamAOffside(offsideTeamA);
        displayForTeamBOffside(offsideTeamB);
        displayForTeamAYellowCard(yellowCardTeamA);
        displayForTeamBYellowCard(yellowCardTeamB);
        displayForTeamARedCard(redCardTeamA);
        displayForTeamBRedCard(redCardTeamB);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBFoul(foulTeamB);
        displayForTeamAPossession(possessionTeamA);
        displayForTeamBPossession(possessionTeamB);
        displayForTeamAGoalAttempt(goalAttemptTeamA);
        displayForTeamBGoalAttempt(goalAttemptTeamB);
    }


    /**
     * set display for goals for team a
     * @param score
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for goals for team b
     * @param score
     */
    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for offside for team a
     * @param score
     */
    public void displayForTeamAOffside(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for offisde for team b
     * @param score
     */
    public void displayForTeamBOffside(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for yellow card for team a
     * @param score
     */
    public void displayForTeamAYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for yellow card for team b
     * @param score
     */
    public void displayForTeamBYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for red card for team a
     * @param score
     */
    public void displayForTeamARedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for red card for team b
     * @param score
     */
    public void displayForTeamBRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for fouls for team a
     * @param score
     */
    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for fouls for team b
     * @param score
     */
    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for possessions for team a
     * @param score
     */
    public void displayForTeamAPossession(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for possessions for team b
     * @param score
     */
    public void displayForTeamBPossession(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for goal attempts for team a
     * @param score
     */
    public void displayForTeamAGoalAttempt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_attempt);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set display for goal attempts for team b
     * @param score
     */
    public void displayForTeamBGoalAttempt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_attempt);
        scoreView.setText(String.valueOf(score));
    }
}
