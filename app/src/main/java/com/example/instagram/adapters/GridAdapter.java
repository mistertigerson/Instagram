package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.adapters.models.GridModel;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    ArrayList<GridModel> list;

    public void setList(ArrayList<GridModel> list){
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image1;
        private ImageView image2;
        private ImageView image3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.grid1_iv);
            image2 = itemView.findViewById(R.id.grid2_iv);
            image3 = itemView.findViewById(R.id.grid3_iv);
        }

        public void onBind(GridModel gridModel) {
            image1.setImageResource(gridModel.getImage1());
            image2.setImageResource(gridModel.getImage2());
            image3.setImageResource(gridModel.getImage3());
        }
    }
}
