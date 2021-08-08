package com.example.instagram.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.adapters.GridAdapter;
import com.example.instagram.adapters.models.GridModel;

import java.util.ArrayList;


public class GridFragment extends Fragment {

    private RecyclerView recyclerView;
    private GridAdapter adapter;
    private ArrayList<GridModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pager, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);

    }

    private void createList() {
        list.add(new GridModel(R.drawable.girl_1, R.drawable.girl_2, R.drawable.girl_3));
        list.add(new GridModel(R.drawable.girl_1, R.drawable.girl_2, R.drawable.girl_3));
        list.add(new GridModel(R.drawable.girl_1, R.drawable.girl_2, R.drawable.girl_4));
        list.add(new GridModel(R.drawable.girl_1, R.drawable.girl_2, R.drawable.girl_3));
        list.add(new GridModel(R.drawable.girl_3, R.drawable.girl_1, R.drawable.girl_4));
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.gridRecycler);
        adapter = new GridAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setList(list);
    }
}