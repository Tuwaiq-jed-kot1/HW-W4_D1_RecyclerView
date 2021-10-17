package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class Users_RecyclerView_Adapter(private val userList:List<Users>):RecyclerView.Adapter<UserAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view, parent,false)

        return  UserAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {

        val user=userList[position]
        holder.id_user.text = " id : ${user.id.toString()}"
        holder.name_user.text = " ${ user.name} "

    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

class UserAdapter{
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView),

        View.OnClickListener{
        val id_user: TextView = itemView.findViewById(R.id.id_textView)
        val name_user: TextView = itemView.findViewById(R.id.name_textView)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Toast.makeText(itemView.context," ${id_user.text} ${name_user.text}", Toast.LENGTH_SHORT).show()

        }
    }

}