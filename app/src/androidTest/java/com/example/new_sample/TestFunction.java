package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestFunction {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTambah(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));

    }

    @Test
    public void testKurang(){
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("15")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
    }

    @Test
    public void testKali(){
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
    }

    @Test
    public void testBagi(){
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("22")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
    }

}
