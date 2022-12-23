package com.abhishek.practical2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText userName, password;
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logIn = findViewById(R.id.button);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);

        logIn.setOnClickListener(view -> {
            String name = userName.getText().toString();
            String pass = password.getText().toString();

            if(name.equals("user") && pass.equals("1234")){
                msg = "Log In Successful";
            } else {
                msg = "Incorrect Info";
            }
            Toast.makeText(this , msg , Toast.LENGTH_SHORT).show();
        });
    }
}