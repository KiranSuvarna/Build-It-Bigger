package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by imkiran on 05/03/18.
 */

public class EndpointsAsyncTaskTest extends AndroidTestCase {

    public void testAsyncJoke() {
        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.execute();
            String joke = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertThat(joke, notNullValue());
            assertTrue(joke.length() > 0);
        } catch (Exception ex) {
            fail("Operation TimedOut");
        }
    }
}
