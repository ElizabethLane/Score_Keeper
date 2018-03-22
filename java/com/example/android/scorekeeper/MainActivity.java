package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int HomeTeamScore = 0;
    int AwayTeamScore = 0;

    int HomeTeamOut = 0;
    int AwayTeamOut = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHomeTeam();
        displayForAwayTeam();
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeam() {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(HomeTeamScore));
    }

    /**
     * Displays the given outs for Home Team.
     */
    public void displayForHomeTeamOut() {
        TextView scoreView = (TextView) findViewById(R.id.home_team_out);
        scoreView.setText(String.valueOf(HomeTeamOut));
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeam() {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(AwayTeamScore));
    }

    /**
     * Displays the given outs for Away Team.
     */
    public void displayForAwayTeamOut() {
        TextView scoreView = (TextView) findViewById(R.id.away_team_out);
        scoreView.setText(String.valueOf(AwayTeamOut));
    }

    /*Increases score Home Team*/

    public void addRunHomeTeam(View v){
        HomeTeamScore+= 1;
        displayForHomeTeam();
    }
    public void addOutHomeTeam(View v){
        HomeTeamOut += 1;
        if (HomeTeamOut == 3){
            HomeTeamOut = 0;
        }
        displayForHomeTeamOut();
    }


    /*Increases score Away Team*/

    public void addRunAwayTeam(View v){
        AwayTeamScore+= 1;
        displayForAwayTeam();
    }
    public void addOutAwayTeam(View v){
        AwayTeamOut += 1;
        if (AwayTeamOut == 3){
            AwayTeamOut = 0;
        }
        displayForAwayTeamOut();
    }

    public void newGame(View v){
        HomeTeamScore = 0;
        AwayTeamScore = 0;

        HomeTeamOut = 0;
        AwayTeamOut = 0;

        displayForAwayTeam();
        displayForHomeTeam();

        displayForAwayTeam();
        displayForHomeTeamOut();

    }



}
