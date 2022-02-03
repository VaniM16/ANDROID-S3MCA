package com.example.mysampapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText pswd;
    Button loginbut;
    String name = "Admin";
    String ps = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.uname);
        pswd = findViewById(R.id.pswd);
        loginbut = findViewById(R.id.login);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName = username.getText().toString();
                String inppass = pswd.getText().toString();

                if (inpName.isEmpty() || inppass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "FIELDS ARE EMPTY", Toast.LENGTH_SHORT).show();
                } else {
                    if (inpName.equals(name) && inppass.equals(ps)) {
                        Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();


                    } else {
                        Toast.makeText(MainActivity.this, "INVALID", Toast.LENGTH_SHORT).show();
                    }

                }
            }


        });
    }
}