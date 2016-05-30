package com.example.pc.liveat500px.manager;

import com.example.pc.liveat500px.dao.PhotoListCollectionDao;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Pc on 27/5/2559.
 */
public interface ApiService {
    @GET("list")
    Call<PhotoListCollectionDao> callPhotoListDao();
}
