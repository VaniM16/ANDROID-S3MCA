package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText phone;
    EditText password;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.Name);
        age=findViewById(R.id.Age);
        phone=findViewById(R.id.Phone);
        password=findViewById(R.id.Password);

    }
    public void onResume(){
        super.onResume();

        SharedPreferences sh=getSharedPreferences("sp", MODE_PRIVATE);

        String s1 = sh.getString("name", "");
        String s2 = sh.getString("pass", "");
        double ph = sh.getInt("phone", 0);
        int a = sh.getInt("age", 0);

        // Setting the fetched data
        // in the EditTexts
        name.setText(s1);
        age.setText(String.valueOf(a));
        phone.setText(String.valueOf(ph));
        password.setText(s2);

    }
    public void onPause() {


        super.onPause();

        // Creating a shared pref object
        // with a file name "MySharedPref"
        // in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
        SharedPreferences.Editor sp2 = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        sp2.putString("name", name.getText().toString());
        sp2.putInt("age", Integer.parseInt(age.getText().toString()));
        sp2.putInt("phone", Integer.parseInt(phone.getText().toString()));
        sp2.putString("pass", password.getText().toString());
        sp2.commit();
        sp2.apply();
    }


}