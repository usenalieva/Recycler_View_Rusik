package com.example.recycler_view.adapter_contact;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler_view.models.Contact;
import com.example.recycler_view.databinding.ItemContactBinding;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private final ItemContactBinding binding;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemContactBinding.bind(itemView);
    }

    public void onBind(Contact contact){
        binding.tv.setText(contact.getName());
        binding.ivProfile.setImageResource(contact.getProfilePic());
    }
}
