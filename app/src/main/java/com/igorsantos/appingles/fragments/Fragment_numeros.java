package com.igorsantos.appingles.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.igorsantos.appingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_numeros extends Fragment {


    public Fragment_numeros() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_numeros, container, false);
    }

}
