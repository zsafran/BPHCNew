package com.example.jacob.bphc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ForumActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.listView);

        arrayList = new ArrayList<String>();
        arrayList.add("thread1");
        arrayList.add("thread2");
        arrayList.add("thread3");
        arrayList.add("thread4");

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.thread_list_item, R.id.threadlist, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String threadId = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(ForumActivity.this, ThreadActivity.class);
                intent.putExtra(threadId, threadId);
                startActivity(intent);
            }
        });
    }

    public void addItem(String text) {
        arrayList.add(text);
        adapter.notifyDataSetChanged();
    }



}
