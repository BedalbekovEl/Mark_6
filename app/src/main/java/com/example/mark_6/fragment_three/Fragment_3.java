package com.example.mark_6.fragment_three;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mark_6.R;


public class Fragment_3 extends Fragment {
    ImageView imageView;
    TextView textViewTitle;
    TextView textViewDesc;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        imageView = view.findViewById(R.id.colosseum);
        textViewTitle = view.findViewById(R.id.title_1);
        textViewDesc = view.findViewById(R.id.description);
        return view;
    }
}