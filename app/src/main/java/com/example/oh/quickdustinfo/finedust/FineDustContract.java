package com.example.oh.quickdustinfo.finedust;

import com.example.oh.quickdustinfo.model.dust_material.FineDust;

/**
 * Created by oh on 2020-06-24.
 */

public class FineDustContract {
   public interface View {
        void showFineDustResult(FineDust fineDust);
        void showLoadError(String message);
        void loadingStart();
        void loadingEnd();
        void reload(double lat, double lng);

    }

    public interface  UserActionsListener{
        void  loadFineDustData();
    }
}
