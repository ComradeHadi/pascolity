package com.ibook.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibook.app.R;


/**
 * Created by Monarchy on 2/12/2016.
 */
public class FragmentRegister extends Fragment {



    public FragmentRegister() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_register, container, false);


        return view;
    }


}
