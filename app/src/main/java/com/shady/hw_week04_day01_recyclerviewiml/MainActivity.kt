package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieTitlesList: List<String>
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.mainActivityRv)

        movieTitlesList = resources.getStringArray(R.array.movie_names).toList()

        for (i in 0 until movieTitlesList.size){
            movieList += Movie(i, movieTitlesList[i])
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MovieRecyclerView(movieList)
    }
}