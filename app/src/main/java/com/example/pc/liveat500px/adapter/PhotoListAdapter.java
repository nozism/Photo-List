package com.example.pc.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import com.example.pc.liveat500px.dao.PhotoListCollectionDao;
import com.example.pc.liveat500px.dao.PhotoListDao;
import com.example.pc.liveat500px.views.PhotoListItem;

/**
 * Created by Pc on 27/5/2559.
 */
public class PhotoListAdapter extends BaseAdapter {

    private PhotoListCollectionDao dao;

    public void setDao(PhotoListCollectionDao dao){
        this.dao= dao ;
    }

    @Override
    public int getCount() {
        if (dao == null){
            return 0;
        }
        if (dao.getPhotoListDao()== null ){
            return 0;
        }
        return dao.getPhotoListDao().size();
    }

    @Override
    public Object getItem(int position) {
        return dao.getPhotoListDao().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PhotoListItem item;
        if (convertView != null){
            item = (PhotoListItem) convertView;
        } else {
            item = new PhotoListItem(parent.getContext());
        }
        PhotoListDao dao = (PhotoListDao) getItem(position);

        item.setNameText(dao.getCaption());
        item.setDetailText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImageUrl(dao.getImageUrl());

        return item;
    }
}
