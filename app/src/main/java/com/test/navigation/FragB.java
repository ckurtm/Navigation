package com.test.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragB extends Fragment {


    public FragB() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_b, container, false);

        FragBDirections.ActionBToC action = FragBDirections.actionBToC();
        action.setInfo(new Info("kurt", 35));

        view.findViewById(R.id.button2a).setOnClickListener(Navigation.createNavigateOnClickListener(action));


        view.findViewById(R.id.button2b).setOnClickListener(Navigation.createNavigateOnClickListener(FragBDirections.actionBToD()));

        return view;
    }

}
