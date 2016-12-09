package com.ibook.app.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibook.app.R;
import com.ibook.app.adapter.BaseAdapter;
import com.ibook.app.adapter.item.Book;
import com.ibook.app.adapter.item.ExamsYear;
import com.ibook.app.adapter.item.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Monarchy on 2/12/2016.
 */
public class FragmentExam extends Fragment {
    private BaseAdapter baseAdapter;
    private List<Object> objectList;
    private Context context;


    public FragmentExam() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_exams, container, false);
        context = getActivity();

        RecyclerView recList = (RecyclerView) view.findViewById(R.id.recyclerView);
        recList.setHasFixedSize(true);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(gridLayoutManager);

        objectList = new ArrayList<>();
        baseAdapter = new BaseAdapter(getActivity(), objectList);
        recList.setAdapter(baseAdapter);

        ExamsYear examsYear = new ExamsYear("1", "2011", "WASSCE");
        ExamsYear examsYearTwo = new ExamsYear("1", "2012", "WASSCE");
        ExamsYear examsYearThree = new ExamsYear("1", "1990", "WASSCE");
        objectList.add(examsYear);
        objectList.add(examsYearTwo);
        objectList.add(examsYearThree);
        baseAdapter.notifyDataSetChanged();


        return view;
    }


}
