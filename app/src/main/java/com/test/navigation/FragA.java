package com.test.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragA extends Fragment {


    public FragA() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a, container, false);
        view.findViewById(R.id.button1a).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_A_to_B));
        view.findViewById(R.id.button1b).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_A_to_G));
        return view;
    }

}
