package com.yugantjoshi.whereru;

import com.yugantjoshi.whereru.api.WhereRUAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public interface WhereRUService
{
    @GET("{building_number}/json")
    Call<WhereRUAPI> getCurrentBuildingInfo(@Path("building_number") int buildingNumber);
}
