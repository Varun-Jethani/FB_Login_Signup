package com.example.fb_login;

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
        Button reg =findViewById(R.id.reg);
        reg.setOnClickListener(view -> {
    Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
    startActivity(intent);
});
    }
}