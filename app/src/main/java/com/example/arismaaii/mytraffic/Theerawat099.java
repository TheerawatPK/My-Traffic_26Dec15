package com.example.arismaaii.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Theerawat099 extends AppCompatActivity {

    //Explicit หรือ การประกาศตัวแปร
    private ListView TrafficListView;
    private Button HOLDButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theerawat099);

        //Bind Widget
        bindWidgget();

        //Button Controller
        buttoncontroller();

    } // main method = กลุ่มคำสั่ง จบด้วย;

    private void buttoncontroller() {

        HOLDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound Effect
                MediaPlayer buttonMediaplayer = MediaPlayer.create(getBaseContext(),
                        R.raw.pig);
                buttonMediaplayer.start();

            } //Event
        });
    } // buttoncontholler

    private void bindWidgget() {
        TrafficListView = (ListView) findViewById(R.id.listView);
        HOLDButton = (Button) findViewById(R.id.button);
    }
} // Main Class นี่คือ class หลัก
