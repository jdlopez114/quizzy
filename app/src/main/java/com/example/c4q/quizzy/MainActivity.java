package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Josiel on 10/3/16.
 */

public class MainActivity extends AppCompatActivity {

    public final static String FILLER_STRING = "com.example.c4q.quizzy.QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendName(View view){
        Intent intent = new Intent(this, QuizActivity.class);
        EditText editText = (EditText) findViewById(R.id.name_edit_text);
        String message = editText.getText().toString();
        intent.putExtra(FILLER_STRING,message);
        startActivity(intent);


    }
}
