package com.example.mridule.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.Nullable;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * Created by mridule on 24/11/19.
 */

public class HomeFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView programmingList = (RecyclerView) view.findViewById(R.id.programminglist);
        programmingList.setLayoutManager(new LinearLayoutManager(getActivity()));
        String[] languages = {"A", "B"};
        programmingList.setAdapter(new ProgramminngAdapter(languages, getContext()));

        return view;
    }
}


