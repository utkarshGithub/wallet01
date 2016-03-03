package com.example.utkarsh.wallet01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Utkarsh on 29-Feb-16.
 */
public class ReadFragment extends android.support.v4.app.Fragment {

    public ReadFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_read, container, false);

        return rootView;
    }

}
