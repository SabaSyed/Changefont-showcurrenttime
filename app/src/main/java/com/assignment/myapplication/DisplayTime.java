package com.assignment.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DisplayTime extends AppCompatActivity {

    private SimpleDateFormat dateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_time);
        Button btn = findViewById(R.id.btn);
        TextView txt = findViewById(R.id.time);
        Button task = findViewById(R.id.task2);

        dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                txt.setText(currentDateTimeString);
            }
        });
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayTime.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}