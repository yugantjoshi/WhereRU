package com.yugantjoshi.whereru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yugantjoshi.whereru.model.Campus;

import java.util.ArrayList;

public class BuildingsActivity extends AppCompatActivity {

    Campus CAC, BUS, LIV,C_D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);

        buildCampus();

    }

    private void buildCampus(){
        CAC = new Campus("College Avenue");
        BUS = new Campus("Busch");
        LIV = new Campus("Livingston");
        C_D = new Campus("Cook/Douglass");
    }
}
