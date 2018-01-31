package com.android.hao.hiweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhenghao on 2018-01-30.
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
