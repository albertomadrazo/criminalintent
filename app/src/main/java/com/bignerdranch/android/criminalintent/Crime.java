package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.text.format.Time;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private String mDateString;
    private boolean mSolved;

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
        mDateString = DateFormat.getDateInstance().format(mDate);
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDateString;
    }

    public void setDate(DateFormat date) {
        mDateString = DateFormat.getDateInstance().format(mDate);
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
