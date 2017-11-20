package com.yugantjoshi.whereru.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public class Building implements Serializable {
    String buildingTitle;
    int buildingNum;

    public Building(String buildingTitle, int buildingNum) {
        this.buildingTitle = buildingTitle;
        this.buildingNum = buildingNum;
    }

    protected Building(Parcel in) {
        buildingTitle = in.readString();
        buildingNum = in.readInt();
    }


    public int getBuildingNum() {
        return buildingNum;
    }

    public String getBuildingTitle() {
        return buildingTitle;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public void setBuildingTitle(String buildingTitle) {
        this.buildingTitle = buildingTitle;
    }

}
