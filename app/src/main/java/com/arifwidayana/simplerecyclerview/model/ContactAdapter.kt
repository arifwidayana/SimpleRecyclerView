package com.arifwidayana.simplerecyclerview.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arifwidayana.simplerecyclerview.databinding.ItemContactBinding

class ContactAdapter(private val listContact: ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            tvNameContact.text  = listContact[position].name
            tvNumberContact.text = listContact[position].number
        }
    }

    override fun getItemCount(): Int {
        return listContact.size
    }
}