package com.example.jacob.bphc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BeforeNewsFeedActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        mButton1 = (Button) findViewById(R.id.Button1);
        mButton2 = (Button) findViewById(R.id.Button2);

        mButton1.setText("Log in as administrator");
        mButton2.setText("Go to news feed");

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLogIn();
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewsFeed();
            }
        });
    }

    private void startLogIn(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void startNewsFeed(){
        Intent intent = new Intent(this, NewsFeedActivity.class);
        startActivity(intent);
    }


}
