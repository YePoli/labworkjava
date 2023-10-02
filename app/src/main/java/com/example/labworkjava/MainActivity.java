package com.example.labworkjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.HelloWorld);
        showBtn = (Button) findViewById(R.id.button);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { textView.setText("my name is Alex");
            }
        });


    }
}