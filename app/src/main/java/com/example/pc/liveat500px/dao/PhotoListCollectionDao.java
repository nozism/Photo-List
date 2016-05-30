package com.example.pc.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**

 * Created by Pc on 27/5/2559.
 */
public class PhotoListCollectionDao {

    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<PhotoListDao> photoListDao;

    public List<PhotoListDao> getPhotoListDao() {
        return photoListDao;
    }

    public void setPhotoListDao(List<PhotoListDao> photoListDao) {
        this.photoListDao = photoListDao;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
