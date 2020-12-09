package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycler_view.adapter_contact.ContactAdapter;
import com.example.recycler_view.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ContactAdapter adapter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init() {
        adapter = new ContactAdapter();
        binding.recyclerView.setAdapter(adapter);
    }
}