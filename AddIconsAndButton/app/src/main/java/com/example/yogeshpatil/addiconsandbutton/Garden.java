package com.example.yogeshpatil.addiconsandbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Garden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);
    }

    public void  openMain(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
