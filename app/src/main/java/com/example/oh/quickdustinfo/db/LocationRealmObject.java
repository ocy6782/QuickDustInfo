package com.example.oh.quickdustinfo.db;

import io.realm.RealmObject;

/**
 * Created by oh on 2020-06-25.
 */

public class LocationRealmObject extends RealmObject {
    private  String name;
    private  double lat;
    private  double lng;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
