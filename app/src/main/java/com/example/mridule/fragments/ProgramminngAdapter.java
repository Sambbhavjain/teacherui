package com.example.mridule.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mridule on 24/11/19.
 */

public class ProgramminngAdapter extends RecyclerView.Adapter<ProgramminngAdapter.ProgrammingViewHolder>{
    private String[] data;
    Context context;
    public ProgramminngAdapter(String[] data, Context context)
    {
        this.data=data;
        this.context=context;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.txtTitle.setText(title);

        };





    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgicon;
        TextView txtTitle;
        public ProgrammingViewHolder (View itemView)

        {
            super(itemView);
            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTtle);
        }
    }

}