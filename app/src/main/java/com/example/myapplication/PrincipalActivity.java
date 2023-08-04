package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myapplication.databinding.ActivityPrincipalBinding;
import com.example.myapplication.fragments.HomeFragment;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.tbPlayzoom);
        addHomeFragment();

    }


    private void addHomeFragment(){
        getSupportFragmentManager().beginTransaction().add(binding.fcvMain.getId(), new HomeFragment()).commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.movies_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.search){
            Snackbar.make(binding.getRoot(),"Search",Snackbar.LENGTH_SHORT).show();
            return true;
        } else if(item.getItemId() == R.id.settings){
            Snackbar.make(binding.getRoot(),"Settings",Snackbar.LENGTH_SHORT).show();
            return true;
        } else{
            return false;
        }
    }
}