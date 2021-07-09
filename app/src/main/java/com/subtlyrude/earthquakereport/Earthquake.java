package com.subtlyrude.earthquakereport;

public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;

    /**
     * name of the city
     */
    private String mLocation;

    /**
     * Date of the earthquake
     */
    private long mTimeInMilliseconds;

    /**
     * root Url
     */
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Get the magnitude.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the city name.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    public String getUrl() { return mUrl; }

}


