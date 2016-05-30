package com.example.pc.liveat500px.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pc.liveat500px.R;
import com.example.pc.liveat500px.adapter.PhotoListAdapter;
import com.example.pc.liveat500px.dao.PhotoListCollectionDao;
import com.example.pc.liveat500px.manager.HttpManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private PhotoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();

        Call<PhotoListCollectionDao> call = HttpManager.getInstance()
                .getServic()
                .callPhotoListDao();
        call.enqueue(new Callback<PhotoListCollectionDao>() {
            @Override
            public void onResponse(Call<PhotoListCollectionDao> call, Response<PhotoListCollectionDao> response) {
                if (response.isSuccessful()){
                    PhotoListCollectionDao dao = response.body();
                    adapter.setDao(dao);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(
                            MainActivity.this,
                            dao.getPhotoListDao().get(0).getCaption(),
                            Toast.LENGTH_LONG
                    ).show();
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            response.code()+" Error ",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }

            @Override
            public void onFailure(Call<PhotoListCollectionDao> call, Throwable t) {
                Toast.makeText(
                        MainActivity.this,
                        t.toString(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
    public void initInstances(){
        listView = (ListView) findViewById(R.id.listView);
        adapter = new PhotoListAdapter();
        listView.setAdapter(adapter);
    }
}
