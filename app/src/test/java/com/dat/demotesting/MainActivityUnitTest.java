package com.dat.demotesting;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Dat on 8/9/2017.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityUnitTest {
    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void testInitViews() throws Exception {
        Assert.assertThat(mainActivity.firstNumber.getHint().toString(), Matchers.equalTo(mainActivity.getString(R.string.first_number_hint)));
        Assert.assertThat(mainActivity.secondNumber.getHint().toString(), Matchers.equalTo(mainActivity.getString(R.string.second_number_hint)));
    }

    @Test
    public void testClicking() throws Exception {
        mainActivity.add.performClick();
        Assert.assertThat(mainActivity.result.getText().toString(), CoreMatchers.equalTo("2"));
    }
}
