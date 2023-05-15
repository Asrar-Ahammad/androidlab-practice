package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty() == true){
                    username.setError("Required");
                }
                else if (password.getText().toString().isEmpty() == true){
                    password.setError("Required");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login successfull",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}