package com.example.andriy.synonymantonymapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by andriy on 3/31/18.
 */

public class ResultsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        HashMap<String, String> pairs = new HashMap<>();
        pairs.put("go", "stop");
        pairs.put("hello", "goodbye");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        String word = getIntent().getStringExtra("word");
        Log.d("word", "");

        TextView result = (TextView)findViewById(R.id.result);

        if(pairs.containsKey(word)){
            result.setText(pairs.get(word));
        }else{
            result.setText("Word not found in database");
        }
    }
}
