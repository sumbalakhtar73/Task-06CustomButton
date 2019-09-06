package com.example.custombuttonwithrelitivelayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.custombuttonwithrelitivelayout.R;

public class CustomAdapterFruits extends BaseAdapter {
   Context context;
   int [] data_fruit;
    LayoutInflater layoutInflater;

    public CustomAdapterFruits(Context context, int[] data_fruit) {
        this.context = context;
        this.data_fruit = data_fruit;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data_fruit.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1;
        view1=layoutInflater.inflate(R.layout.alphabetdesign,null);
        ImageView imageView;
        imageView=(ImageView)view1.findViewById(R.id.imgalphabet);
        imageView.setImageResource(data_fruit[i]);

        return view1;
    }
}
