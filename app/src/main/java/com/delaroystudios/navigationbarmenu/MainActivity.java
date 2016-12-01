package com.delaroystudios.navigationbarmenu;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.delaroystudios.navigationbarmenu.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private BottomBar bottomBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_calls) {
                    // The tab with id R.id.tab_calls was selected,
                    // change your content accordingly.
                    Intent intent = new Intent(getApplicationContext(), CallsActivity.class);
                    startActivity(intent);
                    //textView.setText("Your Calls");
                } else if (tabId == R.id.tab_groups) {
                    // The tab with id R.id.tab_groups was selected,
                    // change your content accordingly.
                    Intent intent = new Intent(getApplicationContext(), GroupsActivity.class);
                    startActivity(intent);
                    //textView.setText("Your Groups");
                } else if (tabId == R.id.tab_chats) {
                    // The tab with id R.id.tab_chats was selected,
                    // change your content accordingly.
                    Intent intent = new Intent(getApplicationContext(), ChatsActivity.class);
                    startActivity(intent);
                    //textView.setText("Your Chats");
                }
            }
        });
    }
}