package com.example.andriy.synonymantonymapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findWord(View v){

        String word = ((EditText)findViewById(R.id.enteredWord)).getText().toString();
        if(!word.equals("")){
            Intent i = new Intent(MainActivity.this, ResultsActivity.class);
            i.putExtra("word", word);

            startActivity(i);

        }else{
            Toast noWord = Toast.makeText(MainActivity.this, "No word entered", Toast.LENGTH_SHORT);
            noWord.show();
        }

    }

    public void enterPair(View v){
        Intent i = new Intent(MainActivity.this, AddPairToDatabaseActivity.class);
        startActivity(i);
    }
}
