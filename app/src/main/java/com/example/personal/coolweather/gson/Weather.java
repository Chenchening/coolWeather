package com.example.personal.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jsyl on 2017/12/28.
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;
    
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
