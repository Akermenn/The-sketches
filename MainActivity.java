package com.example.sstatsmatches.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sstatsmatches.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}


src/main/java/com/example/sstatsmatches/ui/MainActivity.java