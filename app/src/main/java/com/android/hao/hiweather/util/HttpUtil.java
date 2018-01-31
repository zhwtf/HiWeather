package com.android.hao.hiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhenghao on 2018-01-30.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        // Create the OkHttp client and Request
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();

        // the callback will handle the response from the server
        client.newCall(request).enqueue(callback);

    }
}
