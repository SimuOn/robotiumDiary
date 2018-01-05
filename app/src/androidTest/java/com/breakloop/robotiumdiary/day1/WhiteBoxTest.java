package com.breakloop.robotiumdiary.day1;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.breakloop.robotiumdiary.R;
import com.breakloop.robotiumdiary.day1.MainActivity;
import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by user on 2017/12/29.
 */

@RunWith(AndroidJUnit4.class)
public class WhiteBoxTest{
    private static Solo solo;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initSolo(){
        Solo.Config config=new Solo.Config();
        config.commandLogging=true;
        config.commandLoggingTag="WhiteBoxTest";
        solo=new Solo(InstrumentationRegistry.getInstrumentation(),config,activityTestRule.getActivity());
    }

    @Test
    public void Test1(){
        solo.unlockScreen();
        solo.sleep(1000);
        solo.setActivityOrientation(Solo.LANDSCAPE);
        solo.sleep(1000);
        solo.setActivityOrientation(Solo.PORTRAIT);
        solo.sleep(1000);
    }

    @After
    public void closeSolo(){
        solo.sleep(2000);
    }
}
