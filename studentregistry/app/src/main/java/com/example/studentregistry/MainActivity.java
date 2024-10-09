package com.example.studentregistry;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitdata(View view) {
        EditText et_name = findViewById(R.id.sname);
        EditText et_cname = findViewById(R.id.cname);
        EditText email = findViewById(R.id.ename);
        EditText phone = findViewById(R.id.sno);
        TextView tv_res = findViewById(R.id.res);

        tv_res.setText(et_name.getText().toString() + "\n" +
                et_cname.getText().toString() + "\n" +
                email.getText().toString() + "\n" +
                phone.getText().toString());
    }
}
