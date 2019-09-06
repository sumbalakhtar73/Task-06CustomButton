package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterButton;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String [] button={"Alphabets","Counting","Animals","Birds","Vegetables","Fruits"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView) findViewById(R.id.gridview);

        CustomAdapterButton customAdapterButton=new CustomAdapterButton(MainActivity.this,button);
        gridView.setAdapter(customAdapterButton);





    }
}
