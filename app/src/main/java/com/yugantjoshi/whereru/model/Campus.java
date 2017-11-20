package com.yugantjoshi.whereru.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public class Campus implements Serializable
{
    private String campusTitle;
    private List<Building> buildings;

    public Campus(String campusTitle){
        this.campusTitle = campusTitle;
    }
    public Campus(String campusTitle, ArrayList<Building> buildings){
        this.campusTitle = campusTitle;
        this.buildings = buildings;

    }

    public void setCampusTitle(String campusTitle){
        this.campusTitle = campusTitle;
    }
    public void setBuildings(ArrayList<Building> buildings){
        this.buildings = buildings;
    }


    public String getCampusTitle(){
        return this.campusTitle;
    }
    public List<Building> getBuildings(){
        return this.buildings;
    }

    @Override
    public String toString(){
        return "Campus Name: "+campusTitle+"\t NumBuildings: "+getBuildings().size();
    }
}
