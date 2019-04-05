package com.test.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragC extends Fragment {
    public FragC() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.frag_c, container, false);
        view.findViewById(R.id.button3).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_C_to_A));
        Info info = FragCArgs.fromBundle(getArguments()).getInfo();
        if (info != null) {
            Toast.makeText(getActivity(),info.toString(),Toast.LENGTH_SHORT).show();
        }
        return view;
    }

}
