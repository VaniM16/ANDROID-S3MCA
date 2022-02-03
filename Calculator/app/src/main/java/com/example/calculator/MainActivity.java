package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;
    Button badd;
    Button bsub;
    Button bmul;
    Button bdiv;
    float sol=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);

        badd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                float a=Float.parseFloat(t1.getText().toString());
                float b=Float.parseFloat(t2.getText().toString());
                sol=a+b;
                Toast.makeText(MainActivity.this,"Sum is "+sol,Toast.LENGTH_SHORT).show();

            }
        });

        bsub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                float a=Float.parseFloat(t1.getText().toString());
                float b=Float.parseFloat(t2.getText().toString());
                sol=a-b;
                Toast.makeText(MainActivity.this,"Difference is "+sol,Toast.LENGTH_SHORT).show();

            }
        });

        bmul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                float a=Float.parseFloat(t1.getText().toString());
                float b=Float.parseFloat(t2.getText().toString());
                sol=a*b;
                Toast.makeText(MainActivity.this,"Product is "+sol,Toast.LENGTH_SHORT).show();

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                float a=Float.parseFloat(t1.getText().toString());
                float b=Float.parseFloat(t2.getText().toString());
                sol=a/b;
                Toast.makeText(MainActivity.this,"Quotient is "+sol,Toast.LENGTH_SHORT).show();

            }
        });



    }

}