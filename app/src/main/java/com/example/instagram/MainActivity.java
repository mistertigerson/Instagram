package com.example.instagram;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.instagram.databinding.ActivityMainBinding;
import com.example.instagram.fragments.likesFragment;
import com.example.instagram.fragments.mainFragment;
import com.example.instagram.fragments.personalFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        bottomNavigationView = findViewById(R.id.bottom_navi);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new mainFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new mainFragment()).commit();
                        binding.instaTvActivity.setText("Instagram");
                        break;
                    case R.id.ic_likes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new likesFragment()).commit();
                        binding.instaTvActivity.setText("Following");
                        break;
                    case R.id.ic_people:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new personalFragment() ).commit();
                        binding.instaTvActivity.setText("Instagram");
                        break;
                }

                 return true;
            }
        });
    }
}