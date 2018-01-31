package com.android.hao.hiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhenghao on 2018-01-30.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

