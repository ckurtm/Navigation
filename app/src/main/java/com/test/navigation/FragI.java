package com.test.navigation;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragI extends Fragment {


    public FragI() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_i, container, false);
        view.findViewById(R.id.button9).setOnClickListener(Navigation.createNavigateOnClickListener(FragIDirections.actionIToJ()));
        return view;
    }

}
