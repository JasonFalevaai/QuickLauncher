package com.example.jason.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Check if text is passed
        if (getIntent().hasExtra("jason.AndroidStudioProjects.QuickLauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("jason.AndroidStudioProjects.QuickLauncher.SOMETHING");
            tv.setText(text);
        };
    }
}
