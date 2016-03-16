package com.example.jacob.bphc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button mButton1;
    private EditText mEditText;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButton1 = (Button) findViewById(R.id.loginButton);
        mEditText = (EditText) findViewById(R.id.password);


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password = mEditText.getText().toString();
                if (password.equals("BPHC"))
                {
                    //mAccess = true;
                    startNewsFeed(password);
                    //Toast.makeText(getApplicationContext(), password, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect Password", Toast.LENGTH_LONG).show();
                }
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void startNewsFeed(String password){
        Intent intent = new Intent(this, NewsFeedActivity.class);
        intent.putExtra(getString(R.string.password), password);
        startActivity(intent);
    }

}
