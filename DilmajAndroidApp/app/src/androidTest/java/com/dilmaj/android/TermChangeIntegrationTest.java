package com.dilmaj.android;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.dilmaj.android.MainActivity;
import com.dilmaj.android.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TermChangeIntegrationTest {
    private static final String EXPECTED_TERM = "Here's a new Term";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testChangingWordInputIsReflectedinWordView() {
        onView(withId(R.id.wordInput)).perform(typeText(EXPECTED_TERM));
        onView(withId(R.id.wordView)).check(matches(withText(EXPECTED_TERM)));
    }

    @Test
    public void testChangingTranslationInputIsReflectedinTranslationView() {
        onView(withId(R.id.translationInput)).perform(typeText(EXPECTED_TERM));
        onView(withId(R.id.translationView)).check(matches(withText(EXPECTED_TERM)));
    }
}
