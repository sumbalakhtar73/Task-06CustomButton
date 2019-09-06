package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterBirds;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterFruits;

public class Fruits extends AppCompatActivity {

    ListView listView;
    int [] fruits={R.drawable.fruits,R.drawable.apple,R.drawable.banana,
            R.drawable.berry,R.drawable.guava,R.drawable.mango,R.drawable.papaya,
            R.drawable.pineapple,R.drawable.pomegranate, R.drawable.kiwi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        listView=(ListView)findViewById(R.id.listfruits);
        CustomAdapterFruits customAdapterfruits= new CustomAdapterFruits(this,fruits);
        listView.setAdapter(customAdapterfruits);
    }
}
