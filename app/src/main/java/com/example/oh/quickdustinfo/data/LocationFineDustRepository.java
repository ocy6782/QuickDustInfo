package com.example.oh.quickdustinfo.data;

import com.example.oh.quickdustinfo.model.dust_material.FineDust;
import com.example.oh.quickdustinfo.util.FineDustUtil;

import retrofit2.Callback;

/**
 * Created by oh on 2020-06-24.
 */

public class LocationFineDustRepository implements  FineDustRepository {
    private FineDustUtil mFineDustUtil;
    private double mLatitude;
    private double mLongitude;

    public LocationFineDustRepository(){
        mFineDustUtil = new FineDustUtil();
    }

    public LocationFineDustRepository(double lat, double lng){
        this();
        this.mLatitude =lat;
        this.mLongitude = lng;
    }

    @Override
    public boolean isAvailable() {
        if (mLatitude != 0.0 && mLongitude != 0.0) {
            return  true;
        }
         return false;
    }

    @Override
    public void getFineDustData(Callback<FineDust> callback) {
        mFineDustUtil.getApi().getFineDust(mLatitude, mLongitude)
                .enqueue(callback);

    }
}
