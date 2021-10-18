package com.example.recyclerview_hw_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val animalList:List<Animal>):
    RecyclerView.Adapter<AnimalAdapter>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AnimalAdapter {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_layout,parent,false)
        return AnimalAdapter(view)
    }

    override fun onBindViewHolder(holder:AnimalAdapter, position: Int) {
       val item = animalList[position]
        holder.nameTextView.text=item.petName.toString()
        holder.detilTextView.text=item.petType.toString()
        holder.petImageView.setImageResource(item.petImage)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

}

class AnimalAdapter(ItemView: View):RecyclerView.ViewHolder(ItemView),
    View.OnClickListener{
    var petImageView:ImageView= itemView.findViewById(R.id.petImgId)
    var nameTextView:TextView= itemView.findViewById(R.id.petNameId)
    var detilTextView:TextView = itemView.findViewById(R.id.petDetailId)

    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v:View?){
        Toast.makeText(itemView.context,"${nameTextView.text} ",Toast.LENGTH_SHORT).show()
    }
}