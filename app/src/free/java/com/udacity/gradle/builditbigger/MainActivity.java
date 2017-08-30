package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import wolfgoes.com.jokedisplayer.ui.JokeActivity;
import wolfgoes.com.jokedisplayer.utils.Constants;

public class MainActivity extends BaseMainActivity {

    private InterstitialAd mInterstitialAd;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");

        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    @Override
    public void onResponse(final String response) {
        mProgressBar.setVisibility(View.GONE);

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(mContext, JokeActivity.class);
                intent.putExtra(Constants.EXTRA_JOKE, response);
                startActivity(intent);
            }
        });

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
