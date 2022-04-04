package com.example.introandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        Toast.makeText(TicTacToeActivity.this, "Iam at the SECOND ACTIVITY", Toast.LENGTH_LONG).show();

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i][j]; j++) {

                Toast.makeText(this, "aqui-> " + i, Toast.LENGTH_SHORT).show();
            }
        }
    }

}
