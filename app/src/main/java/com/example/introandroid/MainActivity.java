package com.example.introandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUser;
    private EditText editTextPass;
    private Button btnCheckCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUser = findViewById(R.id.editTextUser);
        editTextPass = findViewById(R.id.editTextPass);

        btnCheckCredentials = findViewById(R.id.checkCredentials);
        btnCheckCredentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = editTextUser.getText().toString();
                String pass = editTextUser.getText().toString();

                boolean passwordIsOK = checkPassword(pass);
                if(passwordIsOK){
                    Toast.makeText(MainActivity.this, "Hola " + user + ", your password is OK!!!", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(MainActivity.this, "Hola " + user + ", your password is NOT SECURE!!!!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean checkPassword(String password){

        if (password.length() >= 5){
            Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_LONG).show();
            return true;
        }
        Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_LONG).show();
        return false;
    }
}