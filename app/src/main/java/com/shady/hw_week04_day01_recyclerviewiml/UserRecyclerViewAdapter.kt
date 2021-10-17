package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserRecyclerViewAdapter(private val userList: List<User>):
    RecyclerView.Adapter<UserAdapter>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view, parent,false)
        return UserAdapter(view)
    }

    override fun onBindViewHolder(holder: UserAdapter, position: Int) {
        val user = userList[position]
        holder.idTextView.text= user.id.toString()
        holder.nameTextView.text= user.name

    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

class UserAdapter(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
    val idTextView: TextView = itemView.findViewById(R.id.rvID)
    val nameTextView: TextView = itemView.findViewById(R.id.rvName)
    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        Toast.makeText(itemView.context,"${idTextView.text}",Toast.LENGTH_SHORT).show()
    }


}
