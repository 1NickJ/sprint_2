package com.lambdaschool.sprint_2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static com.lambdaschool.sprint_2.R.layout.text_view_layout;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>
{
    private List<String> list;

    public RecyclerAdapter(List<String> list) {
        this.list = list;
    }

    
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder (textView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder , int position) {
        holder.ItemName.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ItemName;
        public MyViewHolder(TextView itemView) {
            super(itemView);
            ItemName = itemView;
        }
    }
}
