package com.example.instagram.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.adapters.LikesAdapter;
import com.example.instagram.adapters.models.LikesModel;

import java.util.ArrayList;

public class likesFragment extends Fragment {

    private RecyclerView recyclerView;
    private LikesAdapter adapter;
    private ArrayList<LikesModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_likes, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.likes_rv);
        adapter = new LikesAdapter();
        recyclerView.setAdapter(adapter);
        adapter.listAdd(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(0,new LikesModel(R.drawable.kolya, "Kalybek","liked your photo. 1h",R.drawable.img));
        list.add(1,new LikesModel(R.drawable.unnamed, "Beka","liked your photo. 1h",R.drawable.img_2));
        list.add(2,new LikesModel(R.drawable.negr1, "Aziret","liked your photo. 2h",R.drawable.img_2));
        list.add(3,new LikesModel(R.drawable.images, "Tako","liked your photo. 2h",R.drawable.img_1));
        list.add(4,new LikesModel(R.drawable.images1, "Aidana","liked your photo. 4h",R.drawable.img));
        list.add(5,new LikesModel(R.drawable.images2, "Jibek","liked your photo. 5h",R.drawable.img_2));
        list.add(6,new LikesModel(R.drawable.images3, "Aika","liked your photo. 6h",R.drawable.img_1));
    }

}