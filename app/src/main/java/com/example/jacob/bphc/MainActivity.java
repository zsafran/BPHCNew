package com.example.jacob.bphc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ImageView mLogoImageView;
    private TextView mForumTextView;
    private TextView mNewsFeedTextView;
    private TextView mWelcomeTextView;
    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogoImageView = (ImageView)findViewById(R.id.bphcLogo);
        mForumTextView = (TextView) findViewById(R.id.Forum);
        mNewsFeedTextView = (TextView)findViewById(R.id.NewsFeed);
        mWelcomeTextView = (TextView)findViewById(R.id.welcomeText);
        mButton1 = (Button)findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);

        // set up title page
        mButton2.setVisibility(View.INVISIBLE);
        mForumTextView.setVisibility(View.INVISIBLE);
        mNewsFeedTextView.setVisibility(View.INVISIBLE);
        mButton1.setText("Get Started!");

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createHelpPage();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void createHelpPage(){
        mButton2.setVisibility(View.VISIBLE);
        mForumTextView.setVisibility(View.VISIBLE);
        mNewsFeedTextView.setVisibility(View.VISIBLE);
        mLogoImageView.setVisibility(View.INVISIBLE);
        mWelcomeTextView.setVisibility(View.INVISIBLE);

        mButton1.setText("Take me to the News Feed");
        mButton2.setText("Take me to the forum");

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewsFeed();
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startForum();
            }
        });
    }

    private void startNewsFeed(){
        Intent intent = new Intent(this, BeforeNewsFeedActivity.class);
        startActivity(intent);
    }

    private void startForum(){
        Intent intent = new Intent(this, ForumActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
