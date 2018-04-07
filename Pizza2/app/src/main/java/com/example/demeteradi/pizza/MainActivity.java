package com.example.demeteradi.pizza;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    public static TextView data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dump the ingredients on the screen
        data = (TextView) findViewById(R.id.data);
        fetchIngredients process = new fetchIngredients();
        process.execute();

    }




}
