package com.lukes.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreForA = 0;
    private int scoreForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.displayForTeamA();
        this.displayForTeamB();
    }

    public void addOneForTeamA(View view) {
        this.scoreForA += 1;
        this.displayForTeamA();
    }

    public void addTwoForTeamA(View view) {
        this.scoreForA += 2;
        this.displayForTeamA();
    }

    public void addThreeForTeamA(View view) {
        this.scoreForA += 3;
        this.displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(this.scoreForA));
    }

    public void addOneForTeamB(View view) {
        this.scoreForB += 1;
        this.displayForTeamB();
    }

    public void addTwoForTeamB(View view) {
        this.scoreForB += 2;
        this.displayForTeamB();
    }

    public void addThreeForTeamB(View view) {
        this.scoreForB += 3;
        this.displayForTeamB();
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(this.scoreForB));
    }

    public void reset(View view) {
        this.scoreForA = 0;
        this.scoreForB = 0;
        this.displayForTeamA();
        this.displayForTeamB();
    }
}
