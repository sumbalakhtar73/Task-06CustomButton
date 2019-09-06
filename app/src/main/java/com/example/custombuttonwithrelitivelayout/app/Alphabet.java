package com.example.custombuttonwithrelitivelayout.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.adapter.CustomAdapterAlphabet;

import java.util.Collections;

public class Alphabet extends AppCompatActivity {

    ListView listView;
    int [] alphabet={R.drawable.afor,R.drawable.bfor,R.drawable.cfor,R.drawable.dfor,R.drawable.efor,
            R.drawable.ffor,R.drawable.gfor,R.drawable.hfor,R.drawable.ifor,R.drawable.jfor,
            R.drawable.kfor,R.drawable.lfor,R.drawable.mfor,R.drawable.nfor,R.drawable.ofor
    ,R.drawable.pfor,R.drawable.qfor,R.drawable.rfor,R.drawable.sfor,R.drawable.tfor,
            R.drawable.pfor,R.drawable.qfor,R.drawable.rfor,R.drawable.sfor,R.drawable.tfor,
            R.drawable.ufor,R.drawable.vfor,R.drawable.wfor,R.drawable.xfor,R.drawable.yfor,
            R.drawable.zfor};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        listView=(ListView)findViewById(R.id.listalphabet);

        CustomAdapterAlphabet customAdapterAlphabet=new CustomAdapterAlphabet(Alphabet.this,alphabet);
        listView.setAdapter(customAdapterAlphabet);


    }
}
