package com.example.custombuttonwithrelitivelayout.adapter;

import android.content.ContentResolver;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.example.custombuttonwithrelitivelayout.R;
import com.example.custombuttonwithrelitivelayout.app.Alphabet;
import com.example.custombuttonwithrelitivelayout.app.Animal;
import com.example.custombuttonwithrelitivelayout.app.Birds;
import com.example.custombuttonwithrelitivelayout.app.Counting;
import com.example.custombuttonwithrelitivelayout.app.Fruits;
import com.example.custombuttonwithrelitivelayout.app.Vegetable;

public class CustomAdapterButton extends BaseAdapter {

   Context context;
    String [] data_button;
    LayoutInflater layoutInflater;

    public CustomAdapterButton(Context context, String[] data_button) {
        this.context = context;
        this.data_button = data_button;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data_button.length;
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

        view1=layoutInflater.inflate(R.layout.gridviewdesign,null);
        Button button;
        button=(Button)view1.findViewById(R.id.btngridview);

        button.setText(data_button[i]);

        if(i==0)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Alphabet.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Alphabet", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(i==1)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Counting.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Counting", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(i==2)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Animal.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Animals", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(i==3)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Birds.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Birds", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(i==4)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Vegetable.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Vegetables", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(i==5)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent send=new Intent(context, Fruits.class);
                    context.startActivity(send);
                    Toast.makeText(context, "Fruits", Toast.LENGTH_SHORT).show();
                }
            });
        }
        return view1;
    }
}
