package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserRecycleViewAdapter(private val studentList: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            StudentAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_view_item, parent,false)
        return StudentAdapter.ViewHolder(view)
    }
    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder,
                                  position: Int) {
        val student = studentList[position]
        holder.imageImageView.setImageResource(R.drawable.ic_launcher_background)
        holder.idTextView.text = student.id.toString()
        holder.nameTextView.text = "${student.fullName}"
        holder.gpaTextView.text = student.GPA.toString()
    }
    override fun getItemCount(): Int {
        return studentList.size
    }
}

class StudentAdapter{
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val imageImageView: ImageView = itemView.findViewById(R.id.ivImage)
        val idTextView: TextView = itemView.findViewById(R.id.tvId)
        val nameTextView: TextView = itemView.findViewById(R.id.tvName)
        val gpaTextView: TextView = itemView.findViewById(R.id.tvGPA)
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?){
            Toast.makeText(itemView.context,"${idTextView.text} clicked", Toast.LENGTH_LONG)
        }
    }
}
