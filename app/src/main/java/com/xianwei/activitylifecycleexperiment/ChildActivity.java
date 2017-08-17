package com.xianwei.activitylifecycleexperiment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Child screen", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Button childButton = (Button) findViewById(R.id.child_button);
        childButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.i("Child screen", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Child screen", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Child screen", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Child screen", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Child screen", "onDestroy");
        super.onDestroy();
    }
}
