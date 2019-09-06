package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterAnimals;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterCounting;

public class Animal extends AppCompatActivity {

    ListView listView;
    int [] animals={R.drawable.wildanimals,R.drawable.domesticanimals,R.drawable.animalswithbabies};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        listView=(ListView)findViewById(R.id.listanimals);
        CustomAdapterAnimals customAdapteranimals= new CustomAdapterAnimals(this,animals);
        listView.setAdapter(customAdapteranimals);
    }
}
