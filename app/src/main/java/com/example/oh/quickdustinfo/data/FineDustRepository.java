package com.example.oh.quickdustinfo.data;

import com.example.oh.quickdustinfo.model.dust_material.FineDust;

import retrofit2.Callback;

/**
 * Created by oh on 2020-06-24.
 */

public interface FineDustRepository {
    boolean isAvailable();
    void getFineDustData(Callback<FineDust> callback);
}
