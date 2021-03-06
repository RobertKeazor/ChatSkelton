package chat.sample.groupproj.com.chatskelton.Espresso;

import android.content.Intent;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import chat.sample.groupproj.com.chatskelton.MainActivity;
import chat.sample.groupproj.com.chatskelton.R;
import chat.sample.groupproj.com.chatskelton.RegistrationScreen;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {
    @Rule


    public ActivityTestRule<MainActivity>mActivity= new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void onRegistrationLinkClickedTest (){
       // Intents.init();
        onView(withId(R.id.link_signup)).perform(click());
        //mActivity.launchActivity(new Intent());
        intended(hasComponent(RegistrationScreen.class.getName()));
        onView(withId(R.id.link_login)).perform(click());
        intended(hasComponent(MainActivity.class.getName()));


    }


}
