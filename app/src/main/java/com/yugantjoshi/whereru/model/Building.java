package com.yugantjoshi.whereru.model;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public class Building {
    String buildingTitle;
    int buildingNum;

    public Building(String buildingTitle, int buildingNum) {
        this.buildingTitle = buildingTitle;
        this.buildingNum = buildingNum;
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
