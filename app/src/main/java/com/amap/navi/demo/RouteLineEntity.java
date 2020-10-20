package com.amap.navi.demo;

import android.os.Parcel;
import android.os.Parcelable;

import com.amap.api.navi.model.NaviLatLng;

import java.util.ArrayList;

public class RouteLineEntity implements Parcelable {
    public String title;
    public ArrayList<NaviLatLng> points;

    public RouteLineEntity() {
    }

    protected RouteLineEntity(Parcel in) {
        title = in.readString();
        points = in.createTypedArrayList(NaviLatLng.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeTypedList(points);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RouteLineEntity> CREATOR = new Creator<RouteLineEntity>() {
        @Override
        public RouteLineEntity createFromParcel(Parcel in) {
            return new RouteLineEntity(in);
        }

        @Override
        public RouteLineEntity[] newArray(int size) {
            return new RouteLineEntity[size];
        }
    };
}
