package com.dovhan.mobileapp.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.dovhan.mobileapp.data.model.Car;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/cars")
    Call<JsonArray> getCars();

    @GET("/cars/{carId}")
    Call<JsonObject> getCarById(@Path("carId") String carId);

    @POST("/cars")
    Call<Car> addCar(@Body Car car);
}
