package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CitizenRecycleViewAdapter(private val citizenList: List<Citizen>) : RecyclerView.Adapter<CitizenAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitizenAdapter {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_item, parent,false)
        return CitizenAdapter(view)
    }
    override fun onBindViewHolder(holder: CitizenAdapter, position: Int) {
        val citizen = citizenList[position]
        holder.idTextView.text = citizen.id.toString()
        holder.nameTextView.text = "${citizen.houseNum}"
        holder.imageImageView.setImageResource(R.drawable.n)
    }
    override fun getItemCount(): Int {
        return citizenList.size
    }
}

class CitizenAdapter(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
    val imageImageView: ImageView = itemView.findViewById(R.id.ivImage)
    val idTextView: TextView = itemView.findViewById(R.id.tvId)
    val nameTextView: TextView = itemView.findViewById(R.id.tvHouseNum)

    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        Toast.makeText(itemView.context, "${idTextView.text} clicked", Toast.LENGTH_SHORT).show()
    }
}