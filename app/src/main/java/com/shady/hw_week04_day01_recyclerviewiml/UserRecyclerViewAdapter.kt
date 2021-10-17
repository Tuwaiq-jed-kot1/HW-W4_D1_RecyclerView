package com.shady.hw_week04_day01_recyclerviewiml


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserRecyclerViewAdapter(private val userList: MutableList<UserData>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            UserAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return UserAdapter.ViewHolder(view)
    }


    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val user = userList[position]
        holder.rowIdTextView.text = "${user.rowId}."
        holder.nameTextView.text = "Name: ${user.firstName} ${user.lastName}"
        holder.scoreTextView.text = "Contact Info: {${user.contactInfo}}"

    }

    override fun getItemCount(): Int {
        return userList.size
    }

}

class UserAdapter {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener
    {
        val rowIdTextView: TextView = itemView.findViewById(R.id.tvRowId)
        val nameTextView: TextView = itemView.findViewById(R.id.tvName)
        val scoreTextView: TextView = itemView.findViewById(R.id.tvContactInfo)
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            Toast.makeText(itemView.context, "${rowIdTextView.text} clicked", Toast.LENGTH_SHORT).show()
        }
    }
}

/*
class CustomAdapter {

}
*/
