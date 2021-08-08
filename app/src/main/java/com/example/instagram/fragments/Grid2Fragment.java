package com.example.instagram.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.adapters.GridAdapter1;
import com.example.instagram.adapters.models.GridModel1;

import java.util.ArrayList;

public class Grid2Fragment extends Fragment {

    private RecyclerView recyclerView;
    private GridAdapter1 adapter;
    private ArrayList<GridModel1> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);

    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.gridRecycler1);
        adapter = new GridAdapter1();
        recyclerView.setAdapter(adapter);
        adapter.setList(list);

    }

    private void createList() {
        list.add(0, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));
        list.add(1, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));
        list.add(2, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));
        list.add(3, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));
        list.add(4, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));
        list.add(5, new GridModel1(R.drawable.devushki_iz_instagrama_28_foto_1, R.drawable.girl1, R.drawable.girl2));

    }
}