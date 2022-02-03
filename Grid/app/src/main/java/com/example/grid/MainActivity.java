package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,
           button12,button13,button14,button15,button16,button17;
    EditText Edit;

    float mValue1,mValue2;

    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);

        Edit=(EditText) findViewById(R.id.edit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edit==null){
                    Edit.setText(" ");
                }
                else{
                    mValue1=Float.parseFloat(Edit.getText() + "");
                    Add=true;
                    Edit.setText(null);
                }

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() +"0");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edit==null){
                    Edit.setText(" ");
                }
                else{
                    mValue1=Float.parseFloat(Edit.getText() + "");
                    Sub=true;
                    Edit.setText(null);
                }
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edit==null){
                    Edit.setText(" ");
                }
                else{
                    mValue1=Float.parseFloat(Edit.getText() + "");
                    Mul=true;
                    Edit.setText(null);
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edit==null){
                    Edit.setText(" ");
                }
                else{
                    mValue1=Float.parseFloat(Edit.getText() + "");
                    Div=true;
                    Edit.setText(null);
                }
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue2=Float.parseFloat(Edit.getText() + " ");

                if (Add==true){
                    Edit.setText(mValue1+mValue2 + " ");
                    Add=false;
                }
                if (Sub==true){
                    Edit.setText(mValue1-mValue2 + " ");
                    Sub=false;
                }
                if (Mul==true){
                    Edit.setText(mValue1*mValue2 + " ");
                    Mul=false;
                }
                if (Div==true){
                    Edit.setText(mValue1/mValue2 + " ");
                    Div=false;
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText("");
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + ".");
            }
        });












    }
}