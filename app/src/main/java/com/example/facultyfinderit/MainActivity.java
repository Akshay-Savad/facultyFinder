package com.example.facultyfinderit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View view;

    private static int SPLASH = 2400;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.red1);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this,loginpage.class);
                startActivity(homeIntent);
                finish();
                Toast.makeText(MainActivity.this,"WELCOME TO LOGIN PORTAL",Toast.LENGTH_SHORT).show();
            }
        },SPLASH);
    }
}
