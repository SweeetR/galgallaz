package com.example.user.galgallaz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    LinearLayout background;

    RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background=(LinearLayout) findViewById(R.id.backround);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
    }

    public void change(View view) {
        if(rb3.isChecked())
            background.setBackgroundColor(Color.GREEN);
           else{
            if(rb2.isChecked())
                background.setBackgroundColor(Color.BLUE);
            else
                background.setBackgroundColor(Color.RED);}



    }

    public void defult(View view) {
        background.setBackgroundColor(Color.WHITE);
    }
}
