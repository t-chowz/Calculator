package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        int n2 = Integer.parseInt(str2);
        goToAdd(n1, n2 );

    }
    //Button2
    public void sub(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 = Integer.parseInt(str);
        int n2 = Integer.parseInt(str2);
        goToSub(n1, n2 );

    }
    //button3
    public void multi(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 =Integer.parseInt(str);
        int n2 = Integer.parseInt(str2);
        goToMulti(n1, n2 );

    }
    //button4
    public void divide(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String str = number1.getText().toString();
        String str2 = number2.getText().toString();
        int n1 =Integer.parseInt(str);
        int n2 = Integer.parseInt(str2);
        goToDiv(n1, n2 );

    }

    public void goToAdd(int n, int m ){
        int val = n + m;
        String str = String.valueOf(val);

        Intent intent = new Intent(this, addActivity.class);
        intent.putExtra("value", str);
        startActivity(intent);
    }
    public void goToSub(int n, int m ){
        int val = n - m;
        String str = String.valueOf(val);

        Intent intent = new Intent(this, addActivity.class);
        intent.putExtra("value", str);
        startActivity(intent);

    }
    public void goToMulti(int n, int m ){
        int val = n * m;
        String str = String.valueOf(val);

        Intent intent = new Intent(this, addActivity.class);
        intent.putExtra("value", str);
        startActivity(intent);
    }
    public void goToDiv(int n, int m ){
        int val = n/m;
        String str = String.valueOf(val);

        Intent intent = new Intent(this, addActivity.class);
        intent.putExtra("value", str);
        startActivity(intent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}