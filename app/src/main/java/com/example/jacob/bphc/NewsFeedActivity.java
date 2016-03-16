package com.example.jacob.bphc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewsFeedActivity extends AppCompatActivity {

    private String mPassword;
    private Button mNewPostButton;
    private Boolean mAccess = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed2);
        Intent intent = getIntent();
        if (intent != null) {
            mPassword = intent.getStringExtra(getString(R.string.password));
            if (mPassword.equals("BPHC")) {
                mAccess = true;
            }
            mNewPostButton = (Button) findViewById(R.id.newPostButton);

            mNewPostButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mAccess) {
                        startNewsPostActivity();
                    } else {
                        Toast.makeText(getApplicationContext(), "Not Logged In", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
        else {

        }






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void startNewsPostActivity() {
        Intent intent = new Intent(this, NewsPostActivity.class);
        startActivity(intent);
    }

}
