package com.example.mobilelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Context con = getApplicationContext();
        CharSequence text = "Wellcome!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(con, text, duration);
        toast.show();



    }
}