package com.example.workspace.myapplication;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Workspace on 10/29/2017.
 */
public class MainActivity extends Activity {
    Button btnClassic, btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClassic = (Button) findViewById(R.id.btnClassic);
        btnTime = (Button) findViewById(R.id.btnTime);


        btnClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("time", true);
                startActivity(intent);
                finish();
            }
        });




    }}
