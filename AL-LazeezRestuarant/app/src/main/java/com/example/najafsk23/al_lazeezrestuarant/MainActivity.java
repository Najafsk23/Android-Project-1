package com.example.najafsk23.al_lazeezrestuarant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
public void Reservation(View v)
    {
        Toast.makeText(MainActivity.this,"Reservations were made!",Toast.LENGTH_LONG).show();
    }
    public  void quitApp(View v)
    {
        finish();
    }
    }

