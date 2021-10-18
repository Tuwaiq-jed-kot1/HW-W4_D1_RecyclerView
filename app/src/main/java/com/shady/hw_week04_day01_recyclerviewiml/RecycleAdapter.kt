package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rana.RecycleViewApp.R

class RecycleAdapter: RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private var title = arrayOf("Movie One", "Movie Two", "Movie Three", "Movie Four", "Movie Five", "Movie Six", "Movie Seven", "Movie Eight",
        "Movie Nine", "Movie Ten","Movie Eleven", "Movie Twelfth", "Movie Thirteen", "Movie Fourteen", "Movie Fifteen" )
    private  var details = arrayOf("Item one details", "Item one details", "Item one details", "Item one details", "Item one details",
        "Item one details", "Item one details", "Item one details", "Item one details", "Item one details", "Item one details", "Item one details",
        "Item one details", "Item one details", "Item one details")
    private var images = intArrayOf(R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android,
        R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android,
                R.drawable.android, R.drawable.android)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
return title.size
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {

holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImge.setImageResource(images[position])
    }

inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var itemImge: ImageView
    var itemTitle: TextView
    var itemDetail: TextView


    int
    {
        itemImge = itemView.findViewById(R.id.item_image)
        itemTitle = itemView.findViewById(R.id.item_title)
        itemDetail = itemView.findViewById(R.id.item_detail)


    }
}
}