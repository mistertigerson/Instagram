package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.adapters.models.InstaModel;
import com.example.instagram.databinding.MainItemBinding;

import java.util.ArrayList;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<InstaModel> list = new ArrayList<>();

    public void addList(ArrayList<InstaModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MainItemBinding b = MainItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(b);
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


        private MainItemBinding binding;

        public ViewHolder(MainItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(InstaModel instaModel) {
            binding.firstIvRv.setImageResource(instaModel.getImage());
            binding.commentTvRv.setText(instaModel.getComment());
            binding.dateTvRv.setText(instaModel.getDate());
        }
    }
}
