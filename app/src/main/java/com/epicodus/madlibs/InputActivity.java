package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private Button mSubmitButton;
    private EditText mNoun;
    private EditText mVerb;
    private EditText mAdjective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        mNoun = (EditText) findViewById(R.id.noun);
        mAdjective = (EditText) findViewById(R.id.adjective);
        mVerb = (EditText) findViewById(R.id.verb);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String noun = mNoun.getText().toString();
                String adjective = mAdjective.getText().toString();
                String verb = mVerb.getText().toString();
                Intent intent = new Intent(InputActivity.this, ResultsActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("adjective", adjective);
                intent.putExtra("verb", verb);
                startActivity(intent);
            }
        });
    }
}
