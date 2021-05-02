package com.example.mark_6.fragment_two;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mark_6.R;

import java.util.ArrayList;


public class Fragment_2 extends Fragment {
    SecondAdapter secondAdapter;
    RecyclerView recView;
    ArrayList<ModelFragmentTwo> list_2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        recView = view.findViewById(R.id.recycle_number);
        setupSecond();
        return view;


    }
    private void setupSecond(){
        secondAdapter = new SecondAdapter();
        recView.setAdapter(secondAdapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext(),
                RecyclerView.VERTICAL, false);
        recView.setLayoutManager(manager);

        list_2 = new ArrayList<>();
        list_2.add(0, new ModelFragmentTwo("1"));
        list_2.add(1, new ModelFragmentTwo("2"));
        list_2.add(2, new ModelFragmentTwo("3"));
        list_2.add(3, new ModelFragmentTwo("4"));
        list_2.add(4, new ModelFragmentTwo("5"));
        list_2.add(5, new ModelFragmentTwo("6"));
        list_2.add(6, new ModelFragmentTwo("7"));
        list_2.add(7, new ModelFragmentTwo("8"));
        list_2.add(8, new ModelFragmentTwo("9"));
        list_2.add(9, new ModelFragmentTwo("10"));
        list_2.add(10, new ModelFragmentTwo("11"));
        secondAdapter.addNumber(list_2);
    }
}