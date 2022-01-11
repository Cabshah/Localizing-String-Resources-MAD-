package com.example.spinner_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Fruit> fruits;
    private  fruitAdapter obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinner = findViewById(R.id.spinner);
        obj = new fruitAdapter(this, fruits);
        spinner.setAdapter(obj);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Fruit clickedItem = (Fruit) parent.getItemAtPosition(position);
                String clickedName = clickedItem.getName();
                Toast.makeText(MainActivity.this,clickedName + " SELECTED " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private  void initList(){
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple" ,R.drawable.apple));
        fruits.add(new Fruit("Banana" ,R.drawable.banana));
        fruits.add(new Fruit("Dates" ,R.drawable.dates));
        fruits.add(new Fruit("Orange" ,R.drawable.orange));
        fruits.add(new Fruit("Pineapple" ,R.drawable.pineapple));
        fruits.add(new Fruit("Pear" ,R.drawable.pear));

    }
}