package com.example.utkarsh.wallet01;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Utkarsh on 01-Mar-16.
 */
public class HomeFragment  extends android.support.v4.app.Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("arpit1", "working");
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        return rootView;
    }

}