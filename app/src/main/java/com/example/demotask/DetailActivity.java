package com.example.demotask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.demotask.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String name , price , type;
        name = getIntent().getStringExtra("name");
        price = getIntent().getStringExtra("price");
        type = getIntent().getStringExtra("type");

        binding.txtName.setText(name);
        binding.txtPrice.setText("$"+price);
        binding.txtType.setText(type);


        binding.hangBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });

        binding.notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });



    }
}