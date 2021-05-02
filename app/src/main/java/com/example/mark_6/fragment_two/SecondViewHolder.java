package com.example.mark_6.fragment_two;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mark_6.R;


public class SecondViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public SecondViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.number);
    }
    public void onBind(ModelFragmentTwo fragmentTwo){
        textView.setText(fragmentTwo.number);

    }
}
