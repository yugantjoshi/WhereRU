package com.yugantjoshi.whereru;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yugantjoshi.whereru.api.WhereRUAPI;

import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class DetailActivity extends AppCompatActivity {

    TextView description, street, cityStatePostal;
    Button getDirectionsButton;
    String longitude, latitude;
    public static final String BASE_URL = "http://rumaps.rutgers.edu/bldgnum/";
    int buildingNum = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        description = (TextView)findViewById(R.id.detail_description);
        street = (TextView)findViewById(R.id.street);
        cityStatePostal = (TextView)findViewById(R.id.city_state_postal);
        getDirectionsButton = (Button)findViewById(R.id.directions_button);

        String title = getIntent().getStringExtra("buildingName");
        buildingNum = getIntent().getIntExtra("buildingNum",-1);

        Log.d("buildingNum", String.valueOf(buildingNum));
        toolbarLayout.setTitle(title);

        getCurrentBuildingInfoUpdate();

        getDirectionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDirections(latitude, longitude);
            }
        });
    }

    public void getCurrentBuildingInfoUpdate(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WhereRUService whereRUService = retrofit.create(WhereRUService.class);
        Call<WhereRUAPI> whereRUAPICall = whereRUService.getCurrentBuildingInfo(buildingNum);

        whereRUAPICall.enqueue(new Callback<WhereRUAPI>() {
            @Override
            public void onResponse(Call<WhereRUAPI> call, Response<WhereRUAPI> response) {

                String descriptionOutput = String.valueOf(response.body().getDescription());
                String streetOutput = String.valueOf( response.body().getLocation().getStreet());
                String cityStatePostalOutput =String.valueOf(response.body().getLocation().getCity()
                        +", "
                        +response.body().getLocation().getState()+" "
                        +response.body().getLocation().getPostalCode());

                description.setText(descriptionOutput);
                street.setText(streetOutput);
                cityStatePostal.setText(cityStatePostalOutput);

                longitude  = response.body().getLocation().getLongitude();
                latitude = response.body().getLocation().getLatitude();
            }

            @Override
            public void onFailure(Call<WhereRUAPI> call, Throwable t) {
                Log.d("RESPONSE","onFailure");
                Toast.makeText(DetailActivity.this, "Could not get info", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void launchDirections(String latitude, String longitude){
        Uri gmmIntentUri = Uri.parse("google.navigation:q="+latitude+","+longitude);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }
}
