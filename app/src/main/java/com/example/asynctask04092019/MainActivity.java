package com.example.asynctask04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyAsyntask myAsyntask = new MyAsyntask(this);
//        myAsyntask.execute();

    }
    class DownLoadAsyntask extends AsyncTask {

    }
}
