package com.example.trf_custom_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<Integer> {

    Activity context;
    String[] title;
    String[] subtitle;
    Integer[] imgno;

    public CustomAdapter(Activity context, String[] title,String[] subtitle,Integer[] imgno) {
        super(context,R.layout.listtile,imgno);

        this.context=context;
        this.title=title;
        this.subtitle=subtitle;
        this.imgno=imgno;
    }

    public View getView(int index, View view, ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View viewRow=inflater.inflate(R.layout.listtile,null,true);

        ImageView imgview=viewRow.findViewById(R.id.imgview);
        TextView text1=viewRow.findViewById(R.id.text1);
        TextView text2=viewRow.findViewById(R.id.text2);

        text1.setText(title[index]);
        text2.setText(subtitle[index]);
        imgview.setImageResource(imgno[index]);


        return viewRow;


    }



}
