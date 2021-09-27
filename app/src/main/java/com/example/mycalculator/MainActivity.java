package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Button1
    public void add(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 =Integer.parseInt(str);
        int n2 = Integer.parseInt(str);
        goToAdd(n1, n2 );

    }
    //Button2
    public void sub(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 = Integer.parseInt(str);
        int n2 = Integer.parseInt(str);
        goToSub(n1, n2 );

    }
    //button3
    public void multi(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 =Integer.parseInt(str);
        int n2 = Integer.parseInt(str);
        goToMult(n1, n2 );

    }
    //button4
    public void divide(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 =Integer.parseInt(str);
        int n2 = Integer.parseInt(str);
        goToDiv(n1, n2 );

    }

    public void goToAdd(int n, int m ){

    }
    public void goToSub(int n, int m ){

    }
    public void goToMult(int n, int m ){

    }
    public void goToDiv(int n, int m ){

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}