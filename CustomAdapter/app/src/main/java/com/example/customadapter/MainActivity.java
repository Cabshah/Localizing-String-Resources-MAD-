package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    int images[] = {R.drawable.apple , R.drawable.banana , R.drawable.orange , R.drawable.pear ,R.drawable.dates , R.drawable.pineapple};
    String fruit [] = {"APPLE" , "BANANA" , "ORANGE" , "PEAR" , "DATES" , "PINEAPPLE"};
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridView & BaseAdapter");

        grid=(GridView)findViewById(R.id.datagrid);
        gridView obj=new gridView(this,fruit,images);
        grid.setAdapter(obj);
    }

    }
