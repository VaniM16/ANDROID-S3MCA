package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText phone;
    EditText password;
    Button submit;

    Pattern USERNAME_PATTERN=Pattern.compile("^[A-Za-z]\\w{5,30}$");    //Alphabets 6-30 letters
    Pattern PASSWORD_PATTERN =Pattern.compile("^" +
            "(?=.*[@#$%^&+=])" +     // at least 1 special character
            "(?=\\S+$)" +            // no white spaces
            ".{4,}" +                // at least 4 characters
            "$");
    Pattern Phone_PATTERN =Pattern.compile("^(0|91)?[7-9][0-9]{9}$"); //Begins with 0 or 91,then 7 or 8 or 9,then contains 9 digits


    Pattern Age_PATTERN =Pattern.compile("^" +

            "(?=\\S+$)" +            // no white spaces
            "[0-9]{1,2}" +                // 2 numbers
            "$");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.button);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName=name.getText().toString();
                String inpAge=age.getText().toString();
                String inpPh=phone.getText().toString();
                String inpPass=password.getText().toString();





                if(inpName.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Name Field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpAge.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Age field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpPh.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Phone field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpPass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Pass field is Empty", Toast.LENGTH_SHORT).show();
                }

                if (!USERNAME_PATTERN.matcher(inpName).matches()){
                    name.setError("Only alphabets with minimum 6 characters]");
                }


                if (!Age_PATTERN.matcher(inpAge).matches()){
                    age.setError("Incorrect Age");
                }

                if (!Phone_PATTERN.matcher(inpPh).matches()){
                    phone.setError("Invalid Phone Number");
                }

                if (!PASSWORD_PATTERN.matcher(inpPass).matches()){
                    password.setError("Weak Password");
                }

                 else{
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }


            }
        });
    }
}