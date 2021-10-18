package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemRecycleViewAdapter(private val itemList: List<Item>) :
    RecyclerView.Adapter<ItemAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view, parent, false)
        return ItemAdapter(view)
    }

    override fun onBindViewHolder(holder: ItemAdapter, position: Int) {
        val item = itemList[position]
        holder.idTextView.text = item.itemId.toString()
        holder.amountTextView.text = item.amount.toString()
        holder.imageV.setImageResource(R.drawable.goal)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}

class ItemAdapter(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    val idTextView: TextView = itemView.findViewById(R.id.tvId)
    val amountTextView: TextView = itemView.findViewById(R.id.tvAmount)
    val imageV: ImageView = itemView.findViewById(R.id.iVImage)

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Toast.makeText(itemView.context, "${idTextView.text} clicked", Toast.LENGTH_SHORT).show()
    }
}
