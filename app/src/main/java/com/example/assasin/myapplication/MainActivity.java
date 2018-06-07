package com.example.assasin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callPublisherPage(View view){
        Intent startNewActivity = new Intent(this, PublisherHome.class);
        startActivity(startNewActivity);
    }
    public void callFollowerPage(View view){
        Intent startNewActivity = new Intent(this, FollowerHome.class);
        startActivity(startNewActivity);
    }
    public void callSos(View view){
        Intent startNewActivity = new Intent(this, Sos.class);
        startActivity(startNewActivity);
    }
}
