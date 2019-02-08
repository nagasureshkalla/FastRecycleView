package com.example.admin.fastrecycleview;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> implements FastScrollRecyclerViewInterface{

    List<Data> data;
    HashMap<String,Integer> map;
    private Context context;
    public Adapter(List<Data> data,Context context,HashMap<String,Integer> map) {
        this.data = data;
        this.context = context;
        this.map=map;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user,viewGroup,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }
    @Override
    public HashMap<String, Integer> getMapIndex() {
        return this.map;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            viewHolder.t.setText(data.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t=itemView.findViewById(R.id.t);
        }
    }
}
