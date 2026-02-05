package com.example.sstatsmatches.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.sstatsmatches.R;
import com.example.sstatsmatches.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment host = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.navHost);

        if (host == null) {
            return;
        }

        NavController navController = host.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
    }
}


src/main/java/com/example/sstatsmatches/ui/MainActivity.java