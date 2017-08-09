package com.dat.demotesting;

import android.content.Context;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by Dat on 8/9/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityInstrumentedTest {

    @Test
    public void testCreate() {
        Context context = Mockito.mock(MainActivity.class);
        Assert.assertThat(context, CoreMatchers.notNullValue());
        Assert.assertThat(context, CoreMatchers.instanceOf(MainActivity.class));
        String name = "name";
        MainActivity.create(context, name);
    }
}
