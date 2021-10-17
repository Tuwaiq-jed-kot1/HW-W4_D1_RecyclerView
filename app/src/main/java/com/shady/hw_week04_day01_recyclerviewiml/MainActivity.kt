package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var data = mutableListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.rvRecyclerView)
        for (i in 1..50){
            val user = User(
                i,
                "Name: $i")
            data += user
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserRecyclerViewAdapter(data)
    }
}