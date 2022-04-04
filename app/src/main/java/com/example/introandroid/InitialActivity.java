package com.example.introandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InitialActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        btnLogin = findViewById(R.id.btnLogin);
        btnGame = findViewById(R.id.btnTicTacToe);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InitialActivity.this, "LOGIN", Toast.LENGTH_SHORT).show();;
                goToLoginActivity();
            }
        });

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InitialActivity.this, "TicTacToe", Toast.LENGTH_LONG).show();
                goToGameActivity();
            }
        });

    }

    public void goToLoginActivity(){
        Intent intent = new Intent(InitialActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void goToGameActivity(){
        Intent intent = new Intent(InitialActivity.this, TicTacToeActivity.class);
        startActivity(intent);
    }
}