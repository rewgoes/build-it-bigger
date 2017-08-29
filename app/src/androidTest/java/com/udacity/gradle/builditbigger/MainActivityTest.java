package com.udacity.gradle.builditbigger;

import android.text.TextUtils;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertFalse;

public class MainActivityTest {

    private CountDownLatch mSignal;

    @Before
    public void setUp() {
        mSignal = new CountDownLatch(1);
    }

    @Test
    public void testFetchJokeAsyncTask() throws InterruptedException {
        new FetchJokeAsyncTask(new FetchJokeAsyncTask.OnResponseListener() {
            @Override
            public void onResponse(String response) {
                assertFalse(TextUtils.isEmpty(response));
                mSignal.countDown();
            }
        }).execute();

        mSignal.await();
    }

}
