package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterCounting;

public class Counting extends AppCompatActivity {

    ListView listView;
    int [] counting={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four
    ,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,
    R.drawable.nine,R.drawable.ten};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);

        listView=(ListView)findViewById(R.id.listcounting);
        CustomAdapterCounting customAdapterCounting=new CustomAdapterCounting(this,counting);
        listView.setAdapter(customAdapterCounting);
    }
}
