package com.xianwei.activitylifecycleexperiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Main screen", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.i("Main screen", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Main screen", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Main screen", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Main screen", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Main screen", "onDestroy");
        super.onDestroy();
    }
}
