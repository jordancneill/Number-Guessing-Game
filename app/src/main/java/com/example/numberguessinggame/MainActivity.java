package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void createRandNum() {

        Random rand = new Random();
        randomNumber = rand.nextInt(25) + 1;

    }

    public void guess(View view) {

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        int guessValue = Integer.parseInt(editText.getText().toString());

        String message;

        if (guessValue > randomNumber) {

            message = "Lower!";

        } else if (guessValue < randomNumber) {

            message = "Higher!";

        } else {

            message = "Correct! Next Round.";

            createRandNum();

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Value", editText.getText().toString());

        Log.i("Random Number", Integer.toString(randomNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createRandNum();
    }
}