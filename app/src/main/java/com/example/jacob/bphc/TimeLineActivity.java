package com.example.jacob.bphc;

import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by slimj on 3/16/2016.
 */
public class TimeLineActivity extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("healthyboston")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        setListAdapter(adapter);
    }
}
