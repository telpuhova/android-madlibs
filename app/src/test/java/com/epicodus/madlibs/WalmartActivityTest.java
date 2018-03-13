package com.epicodus.madlibs;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class WalmartActivityTest {
    private WalmartActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(WalmartActivity.class);
    }

//    @Test
//    public void validateTextViewContent() {
//        TextView heading = (TextView)activity.findViewById(R.id.heading);
//        assertTrue("Mad Libs".equals(heading.getText().toString()));
//    }

    @Test
    public void ResultsActivityStarted() {
        activity.findViewById(R.id.submitButton).performClick();
        Intent expectedIntent = new Intent(activity, ResultsActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}