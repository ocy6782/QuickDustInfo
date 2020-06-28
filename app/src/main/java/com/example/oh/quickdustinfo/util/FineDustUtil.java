package com.example.oh.quickdustinfo.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by oh on 2020-06-24.
 */

public class FineDustUtil {
    private FineDustApi mGetApi;

    public  FineDustUtil() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(FineDustApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mGetApi = mRetrofit.create(FineDustApi.class);
    }

    public  FineDustApi getApi() {
        return  mGetApi;
    }
}
