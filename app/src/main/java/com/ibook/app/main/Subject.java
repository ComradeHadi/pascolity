package com.ibook.app.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ibook.app.R;
import com.ibook.app.adapter.BaseAdapter;
import com.ibook.app.adapter.item.ExamsSubject;
import com.ibook.app.help.Base;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Base {
    private BaseAdapter baseAdapter;
    private List<Object> objectList;
    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        context = this;

        objectList = new ArrayList<>();
        baseAdapter = new BaseAdapter(this, objectList);
        recyclerView.setAdapter(baseAdapter);


        ExamsSubject examsSubject = new ExamsSubject("1", "Chemistry", R.drawable.ic_chemistry);
        ExamsSubject examsSubjectPhysics = new ExamsSubject("1", "Physics", R.drawable.ic_physics);

        objectList.add(examsSubject);
        objectList.add(examsSubject);
        objectList.add(examsSubjectPhysics);
        objectList.add(examsSubjectPhysics);
        baseAdapter.notifyDataSetChanged();


    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_subject;
    }

    @Override
    protected void setUpWidget() {


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);


    }

    @Override
    protected String setTitle() {
        return getString(R.string.app_name);
    }
}
