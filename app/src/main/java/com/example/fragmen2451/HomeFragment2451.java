package com.example.fragmen2451;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HomeFragment2451 extends Fragment {
    private TextView textView;



    public HomeFragment2451() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home2451, container, false);

        textView = view.findViewById(R.id.text);
        textView.setText("Fragmen 1");
        return  view;
    }
}