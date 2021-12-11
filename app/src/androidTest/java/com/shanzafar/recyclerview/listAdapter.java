package com.shanzafar.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class listAdapter extends RecyclerView.Adapter <listAdapter.listViewHolder>{


    private String[] data;
    public listAdapter(String[] data)
    {
        this.data = data;
    }
    @Override
    public listViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull listAdapter.listViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class listViewHolder extends RecyclerView.ViewHolder{

        public listViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
