package com.example.rafael.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class Joke {

    private String mJoke;

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        mJoke = joke;
    }
}