package com.yugantjoshi.whereru;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yugantjoshi.whereru.model.Building;
import com.yugantjoshi.whereru.model.Campus;

import java.util.ArrayList;
import java.util.List;

public class BuildingActivity extends AppCompatActivity {


    private ListView buildingListView;
    private ArrayAdapter<String> buildingNamesAdapter;
    private ArrayList<String> buildingNames;
    private List<Building> buildingList;
    private Campus chosenCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         chosenCampus = (Campus) getIntent().getSerializableExtra("chosenCampus");

        Log.d("Chosen",chosenCampus.toString());
        getSupportActionBar().setTitle(chosenCampus.getCampusTitle());

        populateBuildings();

    }

    public void populateBuildings(){
        buildingNames = new ArrayList<>();
        for(int i=0; i<chosenCampus.getBuildings().size(); i++){
            buildingNames.add(chosenCampus.getBuildings().get(i).getBuildingTitle());
        }
        buildingNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildingNames);
        buildingListView = (ListView)findViewById(R.id.building_listview);
        buildingListView.setAdapter(buildingNamesAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                Log.d("Up Nagivation", "Navigating back to Campus");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
