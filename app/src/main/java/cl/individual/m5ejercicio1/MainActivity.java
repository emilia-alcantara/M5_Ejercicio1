package cl.individual.m5ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.individual.m5ejercicio1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}