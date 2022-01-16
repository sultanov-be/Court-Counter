package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int PointsA = 0;
    int PointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Reset
    public void resetScore(View view) {
        PointsA = 0;
        PointsB = 0;
        displayForTeamA(PointsA);
        displayForTeamB(PointsB);
    }

    // Team A actions
    public void displayForTeamA (int PointsA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + PointsA);
    }

    public void addThreeForTeamA (View view) {
        PointsA += 3;
        displayForTeamA(PointsA);
    }

    public void addTwoForTeamA (View view) {
        PointsA += 2;
        displayForTeamA(PointsA);
    }

    public void addOneForTeamA (View view) {
        PointsA += 1;
        displayForTeamA(PointsA);
    }

    // Team B actions

    public void displayForTeamB (int PointsA) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + PointsA);
    }

    public void addThreeForTeamB (View view) {
        PointsB += 3;
        displayForTeamB(PointsB);
    }

    public void addTwoForTeamB (View view) {
        PointsB += 2;
        displayForTeamB(PointsB);
    }

    public void addOneForTeamB (View view) {
        PointsB += 1;
        displayForTeamB(PointsB);
    }
}