package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterAnimals;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterBirds;

public class Birds extends AppCompatActivity {

    ListView listView;
    int [] birds={R.drawable.birdss,R.drawable.domesticbirds,R.drawable.birds};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        listView=(ListView)findViewById(R.id.listbirds);
        CustomAdapterBirds customAdapterbirds= new CustomAdapterBirds(this,birds);
        listView.setAdapter(customAdapterbirds);


    }
}
