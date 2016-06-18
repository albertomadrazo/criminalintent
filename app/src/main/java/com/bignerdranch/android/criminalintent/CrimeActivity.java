package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;


public class CrimeActivity extends SingleFragmentActivity {
    private static final String TAG = "### CrimeActivity ###";

    @Override
    protected Fragment createFragment(){
        Log.i(TAG, "nalgonas");
        return new CrimeFragment();
    }
}
