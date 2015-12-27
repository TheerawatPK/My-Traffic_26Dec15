package com.example.arismaaii.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arismaaii on 27/12/2558.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] titleString, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleString, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleString = titleString;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    }//นี่คือ Constructor

    @Override
    public int getCount() {
        return titleString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //For TextView
        TextView titleTextView = (TextView) objView.findViewById(R.id.textView2);
        titleTextView.setText(titleString[position]);

        TextView detaTextView = (TextView) objView.findViewById(R.id.textView3);
        detaTextView.setText(detailStrings[position]);

        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);



        return objView;
    }
} // นี่คือ main class
