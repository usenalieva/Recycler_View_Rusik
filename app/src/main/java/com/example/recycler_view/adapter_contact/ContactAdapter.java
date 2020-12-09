package com.example.recycler_view.adapter_contact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler_view.R;
import com.example.recycler_view.models.Contact;

import java.util.ArrayList;
import java.util.Collections;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private ArrayList<Contact> data = new ArrayList<>();

    public ContactAdapter() {
        setData();
    }

    private void setData() {
        for (int i = 0; i <= 10; i++) {
            data.add(new Contact(R.drawable.ic_launcher_foreground, "name" + i));
            data.add(new Contact(R.drawable.ic_launcher_background, "name" + i + " 2"));
        }
        Collections.shuffle(data);
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(
                                R.layout.item_contact,
                                parent,
                                false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
