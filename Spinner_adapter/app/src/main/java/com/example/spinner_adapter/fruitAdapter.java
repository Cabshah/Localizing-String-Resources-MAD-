package com.example.spinner_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class fruitAdapter extends ArrayAdapter <Fruit> {
    public fruitAdapter(Context context, ArrayList<Fruit> fList) {
        super(context, 0, fList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fruit_spinner, parent, false
            );
        }

        ImageView imageViewF = convertView.findViewById(R.id.imagef);
        TextView textViewF = convertView.findViewById(R.id.txt);

        Fruit currentItem = getItem(position);

        if (currentItem != null) {
            imageViewF.setImageResource(currentItem.getImage());
            textViewF.setText(currentItem.getName());
        }

        return convertView;
    }
}
