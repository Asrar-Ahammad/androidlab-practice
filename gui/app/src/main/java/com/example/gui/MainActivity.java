package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button btn,btn2;
    int ch = 0;
    int size = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.TextView);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextSize(size);
                size = size + 5;
                if (size == 50){
                    size = 25;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1:
                        text.setTextColor(Color.GREEN);
                        ch++;
                        break;
                    case 2:
                        text.setTextColor(Color.RED);
                        ch++;
                        break;
                    case 3:
                        text.setTextColor(Color.YELLOW);
                        ch++;
                        break;
                    default:
                        text.setTextColor(Color.GRAY);
                        ch++;
                        break;
            }
            if(ch==4){
                ch=1;
            }
        }
    });
}
}