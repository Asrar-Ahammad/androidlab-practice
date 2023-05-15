package com.example.calculatorwithbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add, sub, mul, div;
    EditText num1, num2;
    TextView result;
    int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = (Integer.parseInt(num1.getText().toString())) + (Integer.parseInt(num2.getText().toString()));
                result.setText("Result : "+res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = (Integer.parseInt(num1.getText().toString())) - (Integer.parseInt(num2.getText().toString()));
                result.setText("Result : "+res);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = (Integer.parseInt(num1.getText().toString())) * (Integer.parseInt(num2.getText().toString()));
                result.setText("Result : "+res);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = (Integer.parseInt(num1.getText().toString())) / (Integer.parseInt(num2.getText().toString()));
                result.setText("Result : "+res);
            }
        });
    }
}