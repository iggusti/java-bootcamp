package com.example.hari4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDetailActivity();
            }
        });
    }

    private void gotoDetailActivity() {
        Employee employee = new Employee();
        employee.setName("Ilham");
        employee.setAge(22);
        employee.setMarried(false);

        Intent intent = new Intent(this, CalculateActivity.class);
        intent.putExtra("data", employee);
        startActivity(intent);

    }

    }
