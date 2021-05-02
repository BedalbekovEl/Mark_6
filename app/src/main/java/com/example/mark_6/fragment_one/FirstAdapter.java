package com.example.mark_6.fragment_one;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mark_6.R;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstViewHolder> {

    ArrayList<ModelFragmentFirst> data_1 = new ArrayList<>();
    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_1, parent, false);
        return new FirstViewHolder(view);
    }
    public void addNames(ArrayList<ModelFragmentFirst> list_1){
        data_1 = list_1;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {
        holder.onBind(data_1.get(position));

    }

    @Override
    public int getItemCount() {
        return data_1.size();
    }
}
