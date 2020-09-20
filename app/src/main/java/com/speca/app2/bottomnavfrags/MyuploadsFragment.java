package com.speca.app2.bottomnavfrags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.speca.app2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyuploadsFragment extends Fragment {

    public MyuploadsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_myuploads, container, false);
    }
}
