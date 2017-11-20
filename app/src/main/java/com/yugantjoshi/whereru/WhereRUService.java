package com.yugantjoshi.whereru;

import com.yugantjoshi.whereru.api.WhereRUAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yugantjoshi on 11/20/17.
 */

public interface WhereRUService
{
    @GET("{bldingnum}/json")
    Call<WhereRUAPI> getCurrentBuildingInfo(@Query("building_number") int buildingNumber);
}
