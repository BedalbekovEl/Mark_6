package com.example.mark_6.fragment_one;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mark_6.R;

public class FirstViewHolder extends RecyclerView.ViewHolder {
    TextView textView_1;
    TextView textView_2;
    public FirstViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_1 = itemView.findViewById(R.id.name);
        textView_2 = itemView.findViewById(R.id.second_name);
    }
    public void onBind(ModelFragmentFirst fragmentFirst){
        textView_1.setText(fragmentFirst.name);
        textView_2.setText(fragmentFirst.secondName);

    }
}
