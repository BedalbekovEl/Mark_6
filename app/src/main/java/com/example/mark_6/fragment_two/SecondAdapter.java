package com.example.mark_6.fragment_two;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mark_6.R;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondViewHolder> {

    ArrayList<ModelFragmentTwo> data_2 = new ArrayList<>();
    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_2, parent, false);
        return new SecondViewHolder(view);
    }
    public void addNumber(ArrayList<ModelFragmentTwo> list_2){
        data_2 = list_2;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        holder.onBind(data_2.get(position));

    }

    @Override
    public int getItemCount() {
        return data_2.size();
    }
}
