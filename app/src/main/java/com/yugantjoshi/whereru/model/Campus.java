package com.yugantjoshi.whereru.model;

import java.util.ArrayList;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public class Campus
{
    private String campusTitle;
    private ArrayList<Building> buildings;

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
    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }

}
