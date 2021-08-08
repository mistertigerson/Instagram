package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.adapters.models.GridModel1;

import java.util.ArrayList;

public class GridAdapter1 extends RecyclerView.Adapter<GridAdapter1.ViewHolder> {

    private ArrayList<GridModel1> list = new ArrayList<>();

    public void setList(ArrayList<GridModel1> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.griditem1, parent,
                false);
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

        private ImageView img,img1,img2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            img1 = itemView.findViewById(R.id.img2);
            img2 = itemView.findViewById(R.id.img3);
        }

        public void onBind(GridModel1 gridModel1) {
            img.setImageResource(gridModel1.getImg());
            img1.setImageResource(gridModel1.getImg1());
            img2.setImageResource(gridModel1.getImg2());
        }
    }
}
