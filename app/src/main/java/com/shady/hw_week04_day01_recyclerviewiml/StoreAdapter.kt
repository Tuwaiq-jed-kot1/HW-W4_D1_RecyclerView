package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter (private val storeList: List<Store>) : RecyclerView.Adapter<StoreViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_item,parent,false)
        return StoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val store = storeList[position]
        holder.storeNameTextView.text = store.name
        holder.storeRateTextView.text = " Rating = ${store.rate} / 10"
        holder.storeImageView.setImageDrawable(holder.itemView.context.getDrawable(store.drawableReference))
    }

    override fun getItemCount(): Int {
       return storeList.size
    }

}
class StoreViewHolder(itemView : View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
    val storeNameTextView : TextView = itemView.findViewById(R.id.tvStoreName)
    val storeRateTextView : TextView = itemView.findViewById(R.id.tvStoreRate)
    val storeImageView: ImageView = itemView.findViewById(R.id.ivStoreImage)
    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
       Toast.makeText(itemView.context,this.layoutPosition.toString(),Toast.LENGTH_SHORT).show()
    }
}