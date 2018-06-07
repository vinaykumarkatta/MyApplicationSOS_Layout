package com.example.assasin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PublisherHome2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publisher_home2);
    }
    public void callCreateNewTrip(View view){
        Intent startNewActivity = new Intent(this, CreateNewTrip.class);
        startActivity(startNewActivity);
    }
}
