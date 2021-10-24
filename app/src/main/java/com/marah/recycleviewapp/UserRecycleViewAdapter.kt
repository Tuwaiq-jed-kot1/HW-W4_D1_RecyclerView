package com.marah.recycleviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserRecycleViewAdapter(private val userList: List<Item>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder { //adapter View
       val view = LayoutInflater.from(parent.context) //I will inject a new layout so use parent.context
           .inflate(R.layout.recycle_view_item, parent, false)
        return UserAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {//bring the data and put it in the UI
      val user = userList[position]
        holder.nameTextView.text = user.itemName
        holder.priceTextView.text = user.price
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

class UserAdapter{
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView),
    View.OnClickListener{

        val nameTextView: TextView = ItemView.findViewById(R.id.tvItem)
        val priceTextView: TextView = ItemView.findViewById(R.id.tvPrice)

        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
          Toast.makeText(itemView.context, "${nameTextView.text} ${priceTextView.text} clicked",Toast.LENGTH_SHORT).show()
        }

    }


}