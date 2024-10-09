package com.example.intentprogram;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText ename, eemail, ephone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Main Activity");
        if (actionBar != null) {
            actionBar.setTitle("Main Activity");
        }
        button = findViewById(R.id.btn1);
        ename = findViewById(R.id.etName);
        eemail = findViewById(R.id.etmail);
        ephone = findViewById(R.id.etphone);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {

                String name = ename.getText().toString();
                String email = eemail.getText().toString();
                String phone = ephone.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL",email);
                intent.putExtra("PHONE",phone);
                startActivity(intent);
            }
        });
    }
}