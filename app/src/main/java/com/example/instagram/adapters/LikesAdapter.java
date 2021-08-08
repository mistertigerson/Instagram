package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.adapters.models.LikesModel;

import java.util.ArrayList;

public class LikesAdapter extends RecyclerView.Adapter<LikesAdapter.ViewHolder> {

    ArrayList<LikesModel> list = new ArrayList<>();

    public void listAdd(ArrayList<LikesModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.likes_item, parent, false);
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

        private ImageView image;
        private TextView name;
        private TextView text;
        private ImageView image2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_rv);
            name = itemView.findViewById(R.id.name_rv);
            text = itemView.findViewById(R.id.liked_you_rv);
            image2 = itemView.findViewById(R.id.image2_rv);

        }

        public void onBind(LikesModel likesModel) {
            image.setImageResource(likesModel.getImage());
            name.setText(likesModel.getName());
            text.setText(likesModel.getText());
            image2.setImageResource(likesModel.getImage2());

        }
    }
}
