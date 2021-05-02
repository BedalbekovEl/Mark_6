package com.example.mark_6.fragment_one;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mark_6.R;
import com.example.mark_6.ViewPagerAdapter;

import java.util.ArrayList;


public class Fragment_1 extends Fragment {
    FirstAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<ModelFragmentFirst> list = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        recyclerView = view.findViewById(R.id.rec_name);

        setupFirst();

        return view;
    }
    private void setupFirst(){
        adapter = new FirstAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(),
                RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        list = new ArrayList<>();
        list.add(0, new ModelFragmentFirst("Нурсултан", "Осмонов"));
        list.add(1, new ModelFragmentFirst("Бекжан", "Шейшенбеков"));
        list.add(2, new ModelFragmentFirst("Акназар", "Тюменбаев"));
        list.add(3, new ModelFragmentFirst("Наринэ", "Берюева"));
        list.add(4, new ModelFragmentFirst("Нурайым", "Ибраева"));
        list.add(5, new ModelFragmentFirst("Айпери", "Русланбекова"));
        list.add(6, new ModelFragmentFirst("Каныкей", "Казакова"));
        list.add(7, new ModelFragmentFirst("Ануар", "Мусаев"));
        list.add(8, new ModelFragmentFirst("Эмир", "Мамаев"));
        list.add(9, new ModelFragmentFirst("Исламидин", "Арзиев"));
        list.add(10, new ModelFragmentFirst("Бекназар", "Урматбеков"));
        list.add(11, new ModelFragmentFirst("Омар", "Халиков"));
        list.add(12, new ModelFragmentFirst("Эламан", "Бедалбеков"));
        adapter.addNames(list);
    }

}