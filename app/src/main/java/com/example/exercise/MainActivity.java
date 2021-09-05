package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv_HelloWorld;
    int mark = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hook();

        tv_HelloWorld.setText(getString(R.string.txt_helloWorld));
        tv_HelloWorld.append("\n"+getString(R.string.txt_markResult)+" "+ randomNumber());


    }

    private int randomNumber(){
        Random random = new Random();
        mark = random.nextInt(100);
        mark++;
        return mark;
    }

    private void checkMark(){
        if(mark <50){
            tv_HelloWorld.append("\n"+getString(R.string.txt_checkMark_fail));

        }
        if(mark >= 50 && mark <= 69){
            tv_HelloWorld.append("\n"+getString(R.string.txt_checkMark_pass));
        }
        if(mark >= 70){
            tv_HelloWorld.append("\n"+getString(R.string.txt_checkMark_distinction));
        }
    }

    private void hook(){
        tv_HelloWorld = findViewById(R.id.txt_HelloWordl);
    }

}