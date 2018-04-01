package com.example.andriy.synonymantonymapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by andriy on 3/31/18.
 */

public class AddPairToDatabaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_values);


    }


    public void enterValues(View v){
        String word = ((TextView)findViewById(R.id.wordEntered)).getText().toString();
        String synonym = ((TextView)findViewById(R.id.synonymEntered)).getText().toString();

        if(!word.equals("")){
            if(!synonym.equals("")){

                //add to database

            }else{
                Toast noSyn = Toast.makeText(AddPairToDatabaseActivity.this, "No synonym", Toast.LENGTH_SHORT);
                noSyn.show();
            }
        }else{
            Toast noWord = Toast.makeText(AddPairToDatabaseActivity.this, "No word entered", Toast.LENGTH_SHORT);
            noWord.show();
        }

    }


}
