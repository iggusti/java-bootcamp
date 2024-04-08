package com.example.hari4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    private Employee getIntentData() {
        Employee employee = getIntentData().getParcelabExtra;
        String name = employee.getName();
        int age = employee.getAge();
        Boolean maried =employee.isMarried();
        return employee;
    }
}
