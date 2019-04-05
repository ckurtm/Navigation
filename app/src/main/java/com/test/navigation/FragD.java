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
public class FragD extends Fragment {


    public FragD() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_d, container, false);
        view.findViewById(R.id.button4).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_D_to_E));
        return view;
    }

}
