package com.example.semana08dam1apprecyclerviewimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.semana08dam1apprecyclerviewimage.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AndroidAdapter androidAdapter= new AndroidAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvAndroid.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvAndroid.setAdapter(androidAdapter);
        androidAdapter.setData(getData());
    }

    private ArrayList<Android> getData() {
        ArrayList<Android> list = new ArrayList<>();
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image2,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image3,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image4,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image5,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image6,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image7,
                "Angel cake",
                "Android 1.0"));
        list.add(new Android(list.size() +1,
                R.drawable.image8,
                "Angel cake",
                "Android 1.0"));
        return list;
    }
}