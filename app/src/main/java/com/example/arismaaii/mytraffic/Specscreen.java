package com.example.arismaaii.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Specscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specscreen);

        //Sound Effect
        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_start_horse);
        introMediaPlayer.start();

        //Auto run
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent objIntent = new Intent(Specscreen.this, Theerawat099.class);
                startActivity(objIntent);
                finish();


            }
        }, 6000);


    }//main method

}//main class
