package com.example.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button insertbtn,updatebtn,viewbtn,searchbtn,deletebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertbtn=findViewById(R.id.insertbtn);
        updatebtn=findViewById(R.id.updatebtn);
        viewbtn=findViewById(R.id.viewbtn);
        searchbtn=findViewById(R.id.searchbtn);
        deletebtn=findViewById(R.id.deletebtn);

        insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, InsertActivity.class);
                startActivity(i);
            }
        });

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, UpdateActivity.class);
                startActivity(i);
            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, ViewActivity.class);
                startActivity(i);

            }
        });

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i);

            }
        });

        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, DeleteActivity.class);
                startActivity(i);

            }
        });
    }
}
