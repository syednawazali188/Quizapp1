package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finalactivity extends AppCompatActivity {
    TextView ca,wa,fs;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
        ca=(TextView)findViewById(R.id.ca);
        wa=(TextView) findViewById(R.id.wa);
        fs=(TextView)findViewById(R.id.fs);
        restart=(Button)findViewById(R.id.restart);
        StringBuffer sb=new StringBuffer();
        sb.append("Correct Answers:"+START.correct);
        StringBuffer sb1=new StringBuffer();
        sb1.append("Wrong Answers:"+ START.wrong);
        StringBuffer sb2=new StringBuffer();
        sb2.append("Final Scores:"+START.correct);
        ca.setText(sb);
        wa.setText(sb1);
        fs.setText(sb2);
        START.correct=0;
        START.wrong=0;
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}