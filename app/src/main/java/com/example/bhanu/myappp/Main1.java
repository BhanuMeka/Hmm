package com.example.bhanu.myappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Main1 extends AppCompatActivity {
    public void clickFunction(View view)
    {
        EditText Mytext = (EditText) findViewById(R.id.Mytext);
        Log.i("Info",Mytext.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
}
