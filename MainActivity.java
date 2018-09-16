package com.example.hamza.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rLyt;    //button for Relative Layout
    Button cLyt;    //button for Constratint Layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickrLyt(View v){    //do something in response to button "Relative Layout"
       Intent i = new Intent(this, RelativeLayout.class);
       startActivity(i);
    }

    public void onClickcLyt(View v){    //do something in response to button "Constraint Layout"
        Intent i = new Intent(this, ConstraintLayout.class);
        startActivity(i);
    }
}