package com.yugantjoshi.whereru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yugantjoshi.whereru.model.Building;
import com.yugantjoshi.whereru.model.Campus;

import java.util.ArrayList;

public class CampusActivity extends AppCompatActivity {

    Campus CAC, BUS, LIV, C_D;
    ArrayList<Building> collegeAveBuildings, buschBuildings, livingstonBuildings, cookDouglassBuildings;
    private ListView campusListview;
    String[] campusNames = new String[4];
    ArrayAdapter<String> campusNamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        buildCampus();

        campusListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("Clicked",String.valueOf(i));
            }
        });

    }

    private void buildCampus() {
        CAC = new Campus("College Avenue");
        collegeAveBuildings = new ArrayList<>();
        collegeAveBuildings.add(new Building("Rutgers Academic Building", 3198));
        collegeAveBuildings.add(new Building("Bishop House", 3049));
        collegeAveBuildings.add(new Building("Campbell Hall", 3121));
        collegeAveBuildings.add(new Building("School of Communication and Information", 3134));
        collegeAveBuildings.add(new Building("Graduate School of Education", 3037));
        collegeAveBuildings.add(new Building("Frelinghuysen Hall", 3117));
        collegeAveBuildings.add(new Building("Honnors College", 3197));
        collegeAveBuildings.add(new Building("Hardenbergh Hall", 3119));
        collegeAveBuildings.add(new Building("Milledoler Hall", 3010));
        collegeAveBuildings.add(new Building("Murray Hall", 3011));
        collegeAveBuildings.add(new Building("Scott Hall", 3038));
        collegeAveBuildings.add(new Building("Van Dyck Hall", 3016));
        collegeAveBuildings.add(new Building("Voorhees Hall", 3013));
        collegeAveBuildings.add(new Building("Zimmerli Art Museum", 3013));
        CAC.setBuildings(collegeAveBuildings);

        BUS = new Campus("Busch");
        buschBuildings = new ArrayList<>();
        buschBuildings.add(new Building("Allison Road Classroom", 3878));
        buschBuildings.add(new Building("CoRE", 3883));
        buschBuildings.add(new Building("Engineering Building", 3558));
        buschBuildings.add(new Building("Hill Center", 3752));
        buschBuildings.add(new Building("Pharmacy Buidling", 3863));
        buschBuildings.add(new Building("SERC", 3854));
        buschBuildings.add(new Building("Wright Rieman Laboratories", 3556));
        BUS.setBuildings(buschBuildings);

        LIV = new Campus("Livingston");
        livingstonBuildings = new ArrayList<>();
        livingstonBuildings.add(new Building("Beck Hall", 4145));
        livingstonBuildings.add(new Building("Lucy Stone Hall", 4153));
        livingstonBuildings.add(new Building("Rutgers Cinema", 4178));
        livingstonBuildings.add(new Building("Tillet Hall", 4146));
        LIV.setBuildings(livingstonBuildings);

        C_D = new Campus("Cook/Douglass");
        cookDouglassBuildings = new ArrayList<>();
        cookDouglassBuildings.add(new Building("Art History Hall", 8428));
        cookDouglassBuildings.add(new Building("Biological Sciences", 8304));
        cookDouglassBuildings.add(new Building("Blake Hall", 6005));
        cookDouglassBuildings.add(new Building("Bartlett Hall", 6024));
        cookDouglassBuildings.add(new Building("Cook Douglass Lecture Hall", 8840));
        cookDouglassBuildings.add(new Building("Davidson Hall", 8322));
        cookDouglassBuildings.add(new Building("Foran Hall", 6347));
        cookDouglassBuildings.add(new Building("Food Science Building", 6246));
        cookDouglassBuildings.add(new Building("Hickman Hall", 8311));
        cookDouglassBuildings.add(new Building("Heldrich Science Building", 8302));
        cookDouglassBuildings.add(new Building("Loree Classroom Building", 8432));
        cookDouglassBuildings.add(new Building("KLG Learning Center", 8444));
        cookDouglassBuildings.add(new Building("Ruth Adams Building", 8303));
        cookDouglassBuildings.add(new Building("Thompson Hall", 6004));
        cookDouglassBuildings.add(new Building("Waller Hall", 6000));

        campusNames[0] = CAC.getCampusTitle();
        campusNames[1] = BUS.getCampusTitle();
        campusNames[2] = LIV.getCampusTitle();
        campusNames[3] = C_D.getCampusTitle();

        campusNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, campusNames);
        campusListview = (ListView)findViewById(R.id.campus_listview);
        campusListview.setAdapter(campusNamesAdapter);
    }
}
