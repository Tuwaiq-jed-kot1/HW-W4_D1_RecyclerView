package com.shady.hw_week04_day01_recyclerviewiml


import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    private var title = arrayOf( "Chapter 1" ,"Chapter 2", "chapter3 ","Chapter 4" , "Chapter 5"
,"Chapter 6"," Chapter 7","Chapter 8","Chapter 9" , "Chapter 10","Chapter 11" ,"Chapter 12","Chapter13"
,"Chapter 14"," Chapter 15 " )

private var details = arrayOf( "Item 1 details","Item 2 details", "item 3 detalis" ,
    "Item 4details","Item 5details","Item 6 details","Item 7details","Item 8details","Item9details","item 10 details" ,
"Item 11 details ",  "Item 12tails","Item13tails","Item 14 details" , "item 15 details " )

private val images = intArrayOf( R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android ,R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android , R.drawable.android ,R.drawable.android)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder{
        val v =LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent,false )
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return title.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text =title[position]
        holder.itemImage.setImageResource(images[position])   }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail : TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

itemView.setOnClickListener {
  val position : Int =adapterPosition

    Toast.makeText(itemView.context,"you clicked on ${title[position]}",Toast.LENGTH_LONG).show()
        }
    }
}}
