package com.example.menuoptions2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:

                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
                return true;


            case R.id.message:

                Intent j = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(j);
                return true;
            case R.id.item2:

                Intent k = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(k);
                return true;
            case R.id.search:
                Intent l = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(l);
                return true;

            case R.id.call:
                Intent m = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(m);
                return true;


            default:

             return super.onOptionsItemSelected(item);
        }
    }
}