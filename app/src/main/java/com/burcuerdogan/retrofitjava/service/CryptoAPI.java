package com.burcuerdogan.retrofitjava.service;

import com.burcuerdogan.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //URL BASE -> www.website.com
    //GET -> price?key=xxx
    //https://api.nomics.com/v1/currencies/ticker?key=7cd73cdc41a4a2eb6c857d65af68b3c259dcbb86
    @GET("currencies/ticker?key=7cd73cdc41a4a2eb6c857d65af68b3c259dcbb86")
    //@GET("volley_array.json")
    //Call<List<CryptoModel>> getData();
    Observable<List<CryptoModel>> getData();


}
