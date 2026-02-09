package com.example.jidnyasa_today;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Optional splash / login logic
        startActivity(new Intent(this, DashboardActivity.class));
        finish();
    }
}
