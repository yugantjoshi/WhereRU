package com.yugantjoshi.whereru;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.yugantjoshi.whereru.api.WhereRUAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class DetailActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://rumaps.rutgers.edu/bldgnum/";
    int buildingNum = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("buildingName");
        buildingNum = getIntent().getIntExtra("buildingNum",-1);

        toolbar.setTitle(title);
        Log.d("buildingNum", String.valueOf(buildingNum));

        getCurrentBuildingInfoUpdate();
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
                Log.d("RESPONSE","onResponse");
            }

            @Override
            public void onFailure(Call<WhereRUAPI> call, Throwable t) {
                Log.d("RESPONSE","onFailure");
            }
        });

    }
}
