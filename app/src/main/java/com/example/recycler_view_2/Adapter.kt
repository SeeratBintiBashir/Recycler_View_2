package com.example.recycler_view_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val details: List<Details>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.phone_details,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textName.text = details[position].name
        holder.textPhone.text = details[position].phone
    }

    override fun getItemCount(): Int {
        return details.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textName = itemView.findViewById<TextView>(R.id.personName)
        var textPhone = itemView.findViewById<TextView>(R.id.personPhone)
    }


}