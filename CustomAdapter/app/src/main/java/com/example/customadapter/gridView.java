package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridView extends BaseAdapter
{
    private final String name[];
    private final int images[];
    Context context;

    public gridView(Context context,String[] name, int[] images) {
        this.context = context;
        this.name = name;
        this.images = images;
    }

    @Override
    public int getCount()
    {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.singleframe,null);

        ImageView img=(ImageView)view.findViewById(R.id.images);
        TextView tv=(TextView)view.findViewById(R.id.names);

        img.setImageResource(images[position]);
        tv.setText(name[position]);

        return view;
    }
}
