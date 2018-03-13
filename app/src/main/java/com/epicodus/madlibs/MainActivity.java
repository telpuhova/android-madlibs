package com.epicodus.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.heading) TextView mHeading;
    @Bind(R.id.startButton) Button mStartButton;
    @Bind(R.id.radioGroup) RadioGroup mRadioGroup;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Typeface comfortaaFont = Typeface.createFromAsset(getAssets(), "fonts/Comfortaa_Regular.ttf");

        mHeading.setTypeface(comfortaaFont);



        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent == null) {
                    intent = new Intent(MainActivity.this, CampLetterActivity.class);
                }
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_camp_letter:
                if (checked)
                    this.intent = new Intent(MainActivity.this, CampLetterActivity.class);
                break;
            case R.id.radio_pirates:
                if (checked)
                    this.intent = new Intent(MainActivity.this, WashActivity.class);
                break;
            case R.id.radio_walmart:
                if (checked)
                    this.intent = new Intent(MainActivity.this, WalmartActivity.class);
                break;
        }
    }
}
