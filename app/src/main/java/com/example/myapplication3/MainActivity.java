package com.example.myapplication3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isOn=true;
    private int mode=1;//1=cold,heat=2
    private TextView tvmode;
    private TextView tvTemp;
    private int temp;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvmode=findViewById(R.id.tvmode);
        temp=24;

    }

    public void checkMode(View view) {
       if(mode==1){
           mode=2;
       tvmode.setText("heat");}
       else {
           mode=1;
           tvmode.setText("cool");
       }


    }

    public void checkStatus(View view) {
        if(isOn)
            isOn=false;
        else
            isOn=true;;
    }

    public void plus(View view) {
        if(isOn&&temp<30)
        {temp++;
        tvTemp.setText(String.valueOf(temp));
        }
    }

    public void minus(View view) {
        if(isOn&&temp>16)
        {temp--;
            tvTemp.setText(String.valueOf(temp));
        }

        }
    }
