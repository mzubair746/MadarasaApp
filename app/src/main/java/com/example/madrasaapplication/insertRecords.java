package com.example.madrasaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class insertRecords extends AppCompatActivity {

    // temp
    TaskDbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_task);

        db = new TaskDbHelper(this);
        Button insertStudentTask = findViewById(R.id.button2);
        TextView sabaqView = findViewById(R.id.editTextText);
        TextView sabaqiView = findViewById(R.id.editTextText6);
        TextView manzalView = findViewById(R.id.editTextText5);
        TextView rollNoView = findViewById(R.id.editTextText8);
        insertStudentTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rollNo = rollNoView.getText().toString();
                String sabaq = sabaqView.getText().toString();
                String sabaqi = sabaqiView.getText().toString();
                String manzal = manzalView.getText().toString();
                String currentDate = db.getCurrentDate();
                Task task = new Task(rollNo, sabaq, sabaqi, manzal, currentDate);
                db.insertTask(task);

                Intent intent = new Intent(DailyTask.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}