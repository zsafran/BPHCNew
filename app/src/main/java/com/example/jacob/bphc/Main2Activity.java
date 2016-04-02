package com.example.jacob.bphc;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> origin/master
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
<<<<<<< HEAD

public class Main2Activity extends AppCompatActivity {

=======
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button mButton3;
    private Button mButton4;

>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
<<<<<<< HEAD
=======

        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimeline();
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startForum();
            }
        });

    }
    private void startTimeline(){
        Intent intent = new Intent(this, TimeLineActivity.class);
        startActivity(intent);
    }

    private void startForum(){
        Intent intent = new Intent(this, ForumActivity.class);
        startActivity(intent);
>>>>>>> origin/master
    }

}
