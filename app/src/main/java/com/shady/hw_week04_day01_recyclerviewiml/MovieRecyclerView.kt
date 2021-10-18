package com.shady.hw_week04_day01_recyclerviewiml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MovieRecyclerView(private val movieList: List<Movie>):
    RecyclerView.Adapter<MovieRecyclerView.MovieViewHolder>() {
    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val idTextView: TextView = itemView.findViewById(R.id.idTextView)
        val movieTitleTextView: TextView = itemView.findViewById(R.id.movieTitleTextView)
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            Toast.makeText(itemView.context, "${idTextView.text} is clicked", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.idTextView.text = movie.id.toString()
        holder.movieTitleTextView.text = movie.title
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}