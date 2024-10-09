package com.example.intentprogram;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Second Activity");
        Intent intent=getIntent();
        String name=intent.getStringExtra("NAME");
        String email=intent.getStringExtra("EMAIL");
        String phone=intent.getStringExtra("PHONE");
        tv=findViewById(R.id.result_s);
        tv.setText("Name:"+name+"\nEmail:"+email+"\nPhone:"+phone);
    }
}