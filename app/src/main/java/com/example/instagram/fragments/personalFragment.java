package com.example.instagram.fragments;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.adapters.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class personalFragment extends Fragment {

    private ViewPager2 viewPager2;
    private PagerAdapter adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private TabLayout tab;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initPager(view);


        setupTabIcons();

    }

    private void setupTabIcons() {
        new TabLayoutMediator(tab, viewPager2, (tab, position) -> {
            if (position ==0){
                tab.setIcon(R.drawable.ic_contacts);

            }else {
                tab.setIcon(R.drawable.ic_baseline_apps_24);
            }

        }).attach();
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int iconTabed = ContextCompat.getColor(requireContext(), android.R.color.darker_gray);
                tab.getIcon().setColorFilter(iconTabed, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int iconTabed = ContextCompat.getColor(requireContext(), android.R.color.black);
                tab.getIcon().setColorFilter(iconTabed, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    private void createList() {
        list.add(new GridFragment());
        list.add(new Grid2Fragment());
    }

    private void initPager(View itemview) {
        viewPager2 = itemview.findViewById(R.id.pager);
        adapter = new PagerAdapter(this);
        viewPager2.setAdapter(adapter);
        adapter.addList(list);
        tab = itemview.findViewById(R.id.tab1);

    }
}