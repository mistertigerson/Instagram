package com.example.instagram.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.adapters.MainAdapter;
import com.example.instagram.adapters.models.InstaModel;
import com.example.instagram.databinding.FragmentMainBinding;

import java.util.ArrayList;


public class mainFragment extends Fragment {

    private ArrayList<InstaModel> list;
    private MainAdapter adapter;
    private RecyclerView recyclerView;
    private FragmentMainBinding binding;
    private DividerItemDecoration decor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        recyclerView = view.findViewById(R.id.main_recycler);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        adapter.addList(list);


    }

    public void CustomRecyclerView(Context context, @Nullable AttributeSet attrs) {
        decor = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(decor);
    }






    private void createList() {
        list = new ArrayList<>();
        list.add(0,new InstaModel(R.drawable.img, "кчау", "July 5"));
        list.add(1,new InstaModel(R.drawable.img_1, "скидыщь", "July 4"));
        list.add(2,new InstaModel(R.drawable.img_2, "садыровец", "July 25"));
        list.add(3,new InstaModel(R.drawable.img_3, "гад ползучий", "July 25"));

    }
}