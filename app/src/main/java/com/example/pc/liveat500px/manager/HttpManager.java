package com.example.pc.liveat500px.manager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pc on 27/5/2559.
 */
public class HttpManager {
    private static HttpManager instance;

    private HttpManager(){

    }

    public static HttpManager getInstance(){
        if(instance == null){
            instance = new HttpManager() ;
        }

        return instance;
    }
    public ApiService getServic(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://nuuneoi.com/courses/500px/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService service = retrofit.create(ApiService.class);
        return service;
    }
}
