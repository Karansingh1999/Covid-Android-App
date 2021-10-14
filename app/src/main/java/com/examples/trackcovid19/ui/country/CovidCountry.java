package com.examples.trackcovid19.ui.country;

public class CovidCountry {

    String mCovidcountry,mCases,mTodayCases,mDeaths,mTodayDeaths,mRecovered,mCritical;

    public CovidCountry(String mCovidcountry, String mCases ) {
        this.mCovidcountry = mCovidcountry;
        this.mCases = mCases;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mCritical = mCritical;
    }

    public String getmCovidcountry() {
        return mCovidcountry;
    }

    public String getmCases() {
        return mCases;
    }
}
