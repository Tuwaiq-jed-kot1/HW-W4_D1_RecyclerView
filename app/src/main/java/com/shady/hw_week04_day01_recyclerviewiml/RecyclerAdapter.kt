package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var titles = generateTitels(15)
    var details = generateDetails(15)
    var imagesForApp = arrayOf(
        R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
        R.drawable.pcimage, R.drawable.pcimage,
    )


    fun generateTitels(numberOfItems: Int): MutableList<String> {
        var titlesList = mutableListOf<String>()
        for (i in 1..numberOfItems) {
            titlesList.add("PC Number $i")
        }
        return titlesList
    }

    fun generateDetails(numberOfItems: Int): MutableList<String> {
        var detailesList = mutableListOf<String>()
        for (i in 1..numberOfItems) {
            detailesList.add("Best PC Ever")
        }
        return detailesList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(imagesForApp[position])
    }

    override fun getItemCount(): Int {
        return imagesForApp.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) , View.OnClickListener{
        lateinit var itemImage: ImageView
        lateinit var itemTitle: TextView
        lateinit var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            Toast.makeText(itemView.context, "${itemTitle.text} ", Toast.LENGTH_SHORT).show()
        }
    }
}