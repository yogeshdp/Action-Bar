package com.example.yogeshpatil.customizeactionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__one);
    }

    public void goTwo(View view){

        Intent intent = new Intent(this, Activity_Two.class);
        startActivity(intent);
    }
}
