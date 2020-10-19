package com.example.tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivity =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void btnOnClick() {
        onView(withId(R.id.btn)).perform(click());
        onView(withId(R.id.tv)).check(matches(withText("Hello Geecteh")));
        onView(withId(R.id.et)).check(matches(isDisplayed()));
    }

}
