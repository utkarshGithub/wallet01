package com.example.utkarsh.wallet01;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Utkarsh on 29-Feb-16.
 */
public class CreateFragment extends android.support.v4.app.Fragment {

    public CreateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("arpit","working");
        View rootView = inflater.inflate(R.layout.fragment_create, container, false);

        return rootView;
    }

}

