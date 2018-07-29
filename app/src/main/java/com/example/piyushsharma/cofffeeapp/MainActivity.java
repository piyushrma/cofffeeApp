package com.example.piyushsharma.cofffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view)
    {
        int numberofcoffee = 2;
        display(numberofcoffee);
        displayprice(numberofcoffee);
    }
    private void display(int number)
    {
        TextView textView = (TextView) findViewById(R.id.x);
        textView.setText(" "+number);
    }
    private void displayprice(int number)
    {
        TextView textView = (TextView) findViewById(R.id.value2);
        int p= number*5;
        textView.setText(" $"+p);
    }

}
