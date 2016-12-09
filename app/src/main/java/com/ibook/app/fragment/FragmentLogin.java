package com.ibook.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ibook.app.R;
import com.ibook.app.help.AppUtils;


/**
 * Created by Monarchy on 2/12/2016.
 */
public class FragmentLogin extends Fragment implements View.OnClickListener {
    private Button buttonLogin;


    public FragmentLogin() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_login, container, false);

        buttonLogin = (Button)view.findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View view) {
        if(view == buttonLogin){
            AppUtils.navigateUp(getActivity());
        }
    }
}
