package com.epicodus.madlibs;

import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class InputActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<InputActivity> activityTestRule = new ActivityTestRule<>(InputActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText1)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText2)).perform(clearText());
        onView(withId(R.id.editText2)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText3)).perform(clearText());
        onView(withId(R.id.editText3)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText4)).perform(clearText());
        onView(withId(R.id.editText4)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText5)).perform(clearText());
        onView(withId(R.id.editText5)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText6)).perform(closeSoftKeyboard());

        onView(withId(R.id.editText6)).perform(clearText());
        onView(withId(R.id.editText6)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText7)).perform(closeSoftKeyboard());
        onView(withId(R.id.editText7)).perform(clearText());
        onView(withId(R.id.editText7)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText8)).perform(closeSoftKeyboard());
        onView(withId(R.id.editText8)).perform(clearText());
        onView(withId(R.id.editText8)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));
    }

    @Test
    public void checkStartButton() {
        String str = "Dear Brother,\n" +
                "I am having a(n) cute time at camp. The counselour is bad and the food is stupid. I need more dog and a house.\n" +
                "Your coffee,\n" +
                "Steve\t";

        onView(withId(R.id.submitButton)).perform(click());

        onView(withId(R.id.finishedStory)).check(matches(withText(str)));
    }

    @Test
    public void checkInputDisplays() {
        onView(withId(R.id.editText1)).perform(clearText());
        onView(withId(R.id.editText1)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText2)).perform(clearText());
        onView(withId(R.id.editText2)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText3)).perform(clearText());
        onView(withId(R.id.editText3)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText4)).perform(clearText());
        onView(withId(R.id.editText4)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText5)).perform(clearText());
        onView(withId(R.id.editText5)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText6)).perform(closeSoftKeyboard());

        onView(withId(R.id.editText6)).perform(clearText());
        onView(withId(R.id.editText6)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText7)).perform(closeSoftKeyboard());
        onView(withId(R.id.editText7)).perform(clearText());
        onView(withId(R.id.editText7)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));

        onView(withId(R.id.editText8)).perform(closeSoftKeyboard());
        onView(withId(R.id.editText8)).perform(clearText());
        onView(withId(R.id.editText8)).perform(typeText("testWord"))
                .check(matches(withText("testWord")));
        onView(withId(R.id.editText8)).perform(closeSoftKeyboard());
        onView(withId(R.id.submitButton)).perform(click());

        String str = "Dear testWord,\n" +
                "I am having a(n) testWord time at camp. The counselour is testWord and the food is testWord. I need more testWord and a testWord.\n" +
                "Your testWord,\n" +
                "testWord\t";

        onView(withId(R.id.finishedStory)).check(matches(withText(str)));

    }

}
