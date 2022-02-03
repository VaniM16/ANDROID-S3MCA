package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.SharedPreferences;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;

    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);

        password=findViewById(R.id.password);

    }
    public void onResume(){
        super.onResume();
        SharedPreferences sh=getSharedPreferences("sp",MODE_PRIVATE);

        String s1=sh.getString("name"," ");
        int a=sh.getInt("age", 0);
        int p=sh.getInt("phone",0);
        String s2=sh.getString("password"," ");

        name.setText(s1);
        age.setText(String.valueOf(a));

        password.setText(s2);
    }
    public void onPause(){
        super.onPause();

        SharedPreferences sharedPreferences=getSharedPreferences("sp",MODE_PRIVATE);
        SharedPreferences.Editor spedit=sharedPreferences.edit();

        spedit.putString("name",name.getText().toString());
        spedit.putInt("age",Integer.parseInt(age.getText().toString()));

        spedit.putString("password", password.getText().toString());
        spedit.commit();
        spedit.apply();


    }


}