package com.example.asynctask04092019;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ProgressBar progressBar;
    TextView txtProgress;
    Button btnDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mapview();
        setListener();
    }

    private void setListener() {
        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void mapview() {
        hideView(img);
        hideView(txtProgress);
        hideView(progressBar);
    }

    private void showView(View v){
        v.setVisibility(View.VISIBLE);
    }
    private void hideView(View v){
        v.setVisibility(View.GONE);
    }

    private void init() {
        img = findViewById(R.id.imageview);
        progressBar = findViewById(R.id.progressBar);
        txtProgress = findViewById(R.id.textviewProgress);
        btnDownload = findViewById(R.id.buttonDownLoad);
    }

    //param : xu ly logic
    //progress : update giao dien
    //result : gia tri xu ly hoan tat

    class DownLoadAsyntask extends AsyncTask<Void,Integer, Integer>{

        @Override
        protected void onPreExecute() {
            Toast.makeText(MainActivity.this, "Bat dau tai xuong", Toast.LENGTH_SHORT).show();
            showView(progressBar);
            showView(txtProgress);
            hideView(img);
            hideView(btnDownload);
            super.onPreExecute();

        }
        @Override
        protected Integer doInBackground(Void... voids) {
            int maxProgress = 0;
            for ( ; maxProgress <= 100 ; ){
                maxProgress += new Random().nextInt(10) + 1;
                Log.d("BBB",maxProgress + "");
            }
            return null;
        }
    }
}
