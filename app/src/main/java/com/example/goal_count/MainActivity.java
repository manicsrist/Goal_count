package com.example.goal_count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int point=0;
    int pointb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayThree(View view){

       point=point+3;
       display(point);

    }
    public void displayTwo(View view){

        point=point+2;
        display(point);

    }
    public void displayOne(View view){

        point=point+1;
        display(point);

    }
    public void displaybOne(View view){

        pointb=pointb+1;
        displayB(pointb);

    }
    public void displaybTwo(View view){

        pointb=pointb+2;
        displayB(pointb);

    }
    public void displaybThree(View view){

        pointb=pointb+3;
        displayB(pointb);

    }

    public void display(int num){
        TextView textView=(TextView)findViewById(R.id.tv1);
        textView.setText(""+num);

    }
    public void displayB(int num){
        TextView textView=(TextView)findViewById(R.id.tv2);
        textView.setText(""+num);

    }

    public void Reset(View view){
        point=0;
        pointb=0;
       display(point);
       displayB(pointb);
    }
}