package com.example.calculaterlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Tresult;
    Button btn1,btn2,btn3,btn4;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.num1);
        ed2=findViewById(R.id.num2);
        btn1=findViewById(R.id.plus);
        btn2=findViewById(R.id.minus);
        btn3=findViewById(R.id.mul);
        btn4=findViewById(R.id.div);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")|| ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                }
                else {
                    int number1 =Integer.parseInt(ed1.getText().toString());
                    int number2 =Integer.parseInt(ed2.getText().toString());
                    int result = number1+number2;
                    Tresult=findViewById(R.id.result);
                    Tresult.setText("RESULT :" + result);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")|| ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                }
                else {
                    int number1 =Integer.parseInt(ed1.getText().toString());
                    int number2 =Integer.parseInt(ed2.getText().toString());
                    int result = number1-number2;
                    Tresult=findViewById(R.id.result);
                    Tresult.setText("RESULT :" + result);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")|| ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                }
                else {
                    int number1 =Integer.parseInt(ed1.getText().toString());
                    int number2 =Integer.parseInt(ed2.getText().toString());
                    int result = number1*number2;
                    Tresult=findViewById(R.id.result);
                    Tresult.setText("RESULT :" + result);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")|| ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                }
                else {
                    int number1 =Integer.parseInt(ed1.getText().toString());
                    int number2 =Integer.parseInt(ed2.getText().toString());
                    int result = number1/number2;
                    Tresult=findViewById(R.id.result);
                    Tresult.setText("RESULT :" + result);
                }
            }
        });

    }
}