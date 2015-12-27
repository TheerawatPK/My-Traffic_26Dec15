package com.example.arismaaii.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //ListView Controller
        listViewController();

    } // main method = กลุ่มคำสั่ง จบด้วย;

    private void listViewController() {
        //1
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};
        //2
        final String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";

        //3
        String[] strDetail = getResources().getStringArray(R.array.detail_shot);

        //call MyAdapter
        MyAdapter objMyAdapter = new MyAdapter(Theerawat099.this, strTitle, strDetail, intIcon);
        TrafficListView.setAdapter(objMyAdapter);

        //Active When Click on ListView
        TrafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // intent to detail activity
                Intent objIntent = new Intent(Theerawat099.this, DetailActivity.class);


               //put extra
                objIntent.putExtra("Title", strTitle[position]);
                objIntent.putExtra("Image", intIcon[position]);
                objIntent.putExtra("index", position);

                startActivity(objIntent);




            } //event
        });

    }//listViewController


    private void buttoncontroller() {

        HOLDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound Effect
                MediaPlayer buttonMediaplayer = MediaPlayer.create(getBaseContext(),
                        R.raw.pig);
                buttonMediaplayer.start();

                // Intent to Webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/YQHsXMglC9A"));
                startActivity(objIntent);


            } //Event
        });
    } // buttoncontholler

    private void bindWidgget() {
        TrafficListView = (ListView) findViewById(R.id.listView);
        HOLDButton = (Button) findViewById(R.id.button);
    }
} // Main Class นี่คือ class หลัก
