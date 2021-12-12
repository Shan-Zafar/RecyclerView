package com.shanzafar.recyclerview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listAdapter extends RecyclerView.Adapter <listAdapter.listViewHolder>{
    List<Students> studentsList;


    public listAdapter(String[] data)
    {
        this.data = data;
    }
    @Override
    public listViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.list_item_layout, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listAdapter.listViewHolder holder, int position) {

        holder.data = studentsList.get(position);
        holder.textViewFriendName.setText(holder.data.getName());
    }

    @Override
    public int getItemCount() {

        return data.length;
    }

    public class listViewHolder extends RecyclerView.ViewHolder{
        Students data;
        ImageView img;
        TextView text;
        public listViewHolder(@NonNull View itemView) {

            super(itemView);
            img = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.name);
        }
    }

}
