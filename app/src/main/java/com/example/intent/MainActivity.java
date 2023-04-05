package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View v) {
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent obj = new Intent(this,MainActivity2.class);
        startActivity(obj);
    }
}