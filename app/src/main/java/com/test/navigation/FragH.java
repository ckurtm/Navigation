package com.test.navigation;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragH extends Fragment {


    public FragH() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_h, container, false);
//        view.findViewById(R.id.button6).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_F_to_D));
        return view;
    }

}
