package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score)
    {
        TextView scoreViewA= (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by three points.
     */
    public void addThreeForTeamA(View view)
    {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by two points.
     */
    public void addTwoForTeamA(View view)
    {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by one point.
     */
    public void addOneForTeamA(View view)
    {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by three points.
     */
    public void addThreeForTeamB(View view)
    {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team B by two points.
     */
    public void addTwoForTeamB(View view)
    {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team B by one point.
     */
    public void addOneForTeamB(View view)
    {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Reset scores for Team A and Team B.
     */
    public void reset(View view)
    {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Stores values for global variables between different Activities.
     */
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        outState.putInt("scoreForTeamA", scoreForTeamA);
        outState.putInt("scoreForTeamB", scoreForTeamB);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

    /**
     * Restores values for global variables between different Activities.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        scoreForTeamA = savedInstanceState.getInt("scoreForTeamA");
        displayForTeamA(scoreForTeamA);
        scoreForTeamB = savedInstanceState.getInt("scoreForTeamB");
        displayForTeamB(scoreForTeamB);
    }
}
