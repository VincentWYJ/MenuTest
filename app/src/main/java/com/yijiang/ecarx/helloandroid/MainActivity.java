package com.yijiang.ecarx.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "HelloApplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu menu = new Menu();
        menu.setId(2);
        menu.setName("hello");

        Log.i(TAG, "" + menu.getId());
        Log.i(TAG, "" + menu.getName());
    }
}
