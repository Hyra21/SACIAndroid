package com.alucintech.saci.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alucintech.saci.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link carnetFragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class carnetFragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_carnet4, container, false);

        return rootView;
    }
}