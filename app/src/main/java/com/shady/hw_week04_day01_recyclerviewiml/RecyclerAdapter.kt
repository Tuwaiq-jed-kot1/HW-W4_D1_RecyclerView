package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val chapters = listOf<String>(
        "Chapter1",
        "Chapter2",
        "Chapter3",
        "Chapter4",
        "Chapter5",
        "Chapter6",
        "Chapter7",
        "Chapter8",
        "Chapter9",
        "Chapter10",
        "Chapter11",
        "Chapter12",
        "Chapter13",
        "Chapter14",
        "Chapter15"
    )
    private val details = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycle_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemChapter.text = chapters[position]
        holder.itemDetails.text = details[position].toString()
    }

    override fun getItemCount(): Int {
        return chapters.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemChapter: TextView
        var itemDetails: TextView

        init {
            itemChapter = itemView.findViewById(R.id.tvChapter)
            itemDetails = itemView.findViewById(R.id.tvDetails)

            itemView.setOnClickListener {

                Toast.makeText(itemView.context, "${itemChapter.text} clicked", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }
}