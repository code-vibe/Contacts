package com.example.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactListItemBinding

class ContactListAdapter() : RecyclerView.Adapter<ContactListAdapter.ContactListViewHolder>() {
    private val contactData = mutableListOf<Contact>(
        Contact("Sam", "0809234567878"),
        Contact("Faithyy", "08123456789"),
    )

    class ContactListViewHolder(private val binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(contact: Contact) {
            binding.nameTextView.text = contact.name
            binding.phoneNumberTextView.text = contact.number
        }
    }

    fun setupContactData(contact: List<Contact>) {
        contactData.addAll(contact)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val adapterLayout = ContactListItemBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ContactListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        val contact = contactData[position]
        holder.bindItem(contact)
    }

    override fun getItemCount(): Int {
        return contactData.size
    }
}