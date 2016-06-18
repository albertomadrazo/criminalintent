package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;


public class CrimeActivity extends SingleFragmentActivity {
    private static final String TAG = "### CrimeActivity ###";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()");
    }

    @Override
    protected Fragment createFragment(){
        Log.i(TAG, "createFragment()");
        return new CrimeFragment();
    }
}
