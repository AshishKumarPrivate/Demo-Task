package com.example.demotask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.demotask.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    List<String> name =  new ArrayList<String>();
    List<String> price =  new ArrayList<String>();
    List<String> type =  new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        name.add("John Smith 1");
        name.add("John Smith 2");
        name.add("John Smith 3");
        name.add("John Smith 4");
        name.add("John Smith 5");

        price.add("1.25");
        price.add("2.15");
        price.add("5.10");
        price.add("7.20");
        price.add("2.55");

        type.add("Micro");
        type.add("ECM ");
        type.add("ECM Pro");
        type.add("ECM Plus");
        type.add("ECM ");

        DataListAdapter adapter = new DataListAdapter(this , name , price , type);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);

        binding.hangBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });

        binding.notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });



    }
}