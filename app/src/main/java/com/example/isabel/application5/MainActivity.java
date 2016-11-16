package com.example.isabel.application5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void showGreetings(View view){
       String button_text;
       button_text=((Button)view).getText().toString();


       if (button_text.equals("open second activity")) {
           Intent intent = new Intent(this, Second.class);
           startActivity(intent); }

       else if (button_text.equals("open third activity")) {Intent intent = new Intent(this, Third.class);
           startActivity(intent);      }    }}