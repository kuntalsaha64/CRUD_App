package com.example.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    EditText name, email, phone;
    Button submitBtn;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        submitBtn=findViewById(R.id.submit);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserDbHelper userDbHelper=new UserDbHelper(InsertActivity.this);
                db=userDbHelper.getWritableDatabase();

                userDbHelper.insertData(name.getText().toString(),email.getText().toString(),phone.getText().toString(),db);

                Toast.makeText(InsertActivity.this, "Insertion Successful", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
