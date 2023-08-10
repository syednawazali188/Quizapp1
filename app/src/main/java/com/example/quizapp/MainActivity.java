package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;
    TextView txt;
    EditText etxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button);
        etxt=(EditText)findViewById(R.id.editTextTextPersonName);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ed_text=etxt.getText().toString().trim();
                if(ed_text.isEmpty() || ed_text==null || ed_text.matches("")){
                    Toast.makeText(getApplicationContext(),"First Enter The Name",Toast.LENGTH_LONG).show();
                }else{
                    Intent intent=new Intent(getApplicationContext(),START.class);
                    intent.putExtra("NAME",ed_text);
                    startActivity(intent);
                }


                //call the activity for quiz
            }
        });
        bt2=(Button)findViewById(R.id.button2);
        
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(getApplicationContext(),Aboutactivity.class);
                startActivity(it);
            }
        });

    }
}