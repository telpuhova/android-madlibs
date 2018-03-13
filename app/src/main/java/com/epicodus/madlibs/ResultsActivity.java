package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    private TextView mNounTextView;
    private TextView mAgjectiveTextView;
    private TextView mVerbTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String adjective = intent.getStringExtra("adjective");
        String verb = intent.getStringExtra("verb");

        mNounTextView = (TextView) findViewById(R.id.nounTextView);
        mAgjectiveTextView = (TextView) findViewById(R.id.adjectiveTextView);
        mVerbTextView = (TextView) findViewById(R.id.verbTextView);

        mNounTextView.setText(noun);
        mAgjectiveTextView.setText(adjective);
        mVerbTextView.setText(verb);


    }
}
