package com.example.datepicks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker picker;
    Button btnGet;
    TextView tvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvw = findViewById(R.id.textView1);
        picker = findViewById(R.id.datePicker1);
        btnGet = findViewById(R.id.button1);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = picker.getDayOfMonth();
                int month = picker.getMonth() + 1; // Month is 0-based, so add 1
                int year = picker.getYear();
                String selectedDate = "Selected Date: " + day + "/" + month + "/" + year;
                tvw.setText(selectedDate);
            }
        });
    }
}
