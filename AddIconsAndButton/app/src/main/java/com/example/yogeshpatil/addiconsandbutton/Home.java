package com.example.yogeshpatil.addiconsandbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openGarden(View view){

        Intent intent = new Intent(this, Garden.class);
        startActivity(intent);
    }
}
