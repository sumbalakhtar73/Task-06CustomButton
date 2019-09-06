package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterFruits;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterVegetables;

public class Vegetable extends AppCompatActivity {

    ListView listView;
    int [] vegetables={R.drawable.vegetable,R.drawable.vegetabless,R.drawable.vegetablesss};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        listView=(ListView)findViewById(R.id.listvegetables);
        CustomAdapterVegetables customAdapterVegetables= new CustomAdapterVegetables(this,vegetables);
        listView.setAdapter(customAdapterVegetables);
    }
}
