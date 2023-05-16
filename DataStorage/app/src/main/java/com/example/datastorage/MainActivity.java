package com.example.datastorage;

import static com.example.datastorage.R.id.BFName;
import static com.example.datastorage.R.id.GFName;
import static com.example.datastorage.R.layout;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText E1,E2;
    DBHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        mydb = new DBHelper(this);
        E1 = (EditText)findViewById(BFName);
        E2 = (EditText) findViewById(GFName);
    }

    public void insert(View view) {
        mydb.insertdata(E1.getText().toString(),E2.getText().toString());
        Toast.makeText(this,"Data Inserted",Toast.LENGTH_SHORT).show();
    }

    public void clear(View view){
        E1.setText("");
        E2.setText("");
    }

    public void viewdata(View view){
        Cursor c = mydb.getalldata();
        if(c.getCount()==0){
            showdialog("Alert", "No Data Found");
        }
        else{
            StringBuffer bf = new StringBuffer();
            while(c.moveToNext()){
                bf.append("First Name:"+c.getString(0)+"\n");
                bf.append("Last Name:"+c.getString(1)+"\n");
            }
            showdialog("Data", bf.toString());
        }
    }

    public void showdialog(String title, String msg){
        AlertDialog.Builder bu = new AlertDialog.Builder(this);
        bu.setCancelable(true);
        bu.setTitle(title);
        bu.setMessage(msg);
        bu.show();
    }
}
