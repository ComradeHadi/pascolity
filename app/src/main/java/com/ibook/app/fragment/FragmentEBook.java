package com.ibook.app.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibook.app.R;
import com.ibook.app.adapter.BaseAdapter;
import com.ibook.app.adapter.item.Book;
import com.ibook.app.adapter.item.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Monarchy on 2/12/2016.
 */
public class FragmentEBook extends Fragment {
    private BaseAdapter baseAdapter;
    private List<Object> objectList;
    private Context context;


    public FragmentEBook() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_e_book, container, false);
        context = getActivity();

        RecyclerView recList = (RecyclerView) view.findViewById(R.id.recyclerView);
        recList.setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(linearLayoutManager);

        objectList = new ArrayList<>();
        baseAdapter = new BaseAdapter(getActivity(), objectList);
        recList.setAdapter(baseAdapter);

        User user = new User("1", "Verma Lilian", "Tortoise Group Ltd", "https://img.clipartfest.com/d80b130769862fc3f218d38d8957f1b9_-tortoise-clipart-green-green-tortoise-clipart_600-319.png");
        String image = "https://static.independent.co.uk/s3fs-public/styles/story_medium/public/thumbnails/image/2015/03/30/23/web-Leopard-Tortoise-Get.jpg";
        Book book = new Book("1", "Slow like tortoise", "Never ming", image, "12 Sept,2016", user);
        objectList.add(book);
        objectList.add(book);
        objectList.add(book);
        baseAdapter.notifyDataSetChanged();
        return view;
    }


}
