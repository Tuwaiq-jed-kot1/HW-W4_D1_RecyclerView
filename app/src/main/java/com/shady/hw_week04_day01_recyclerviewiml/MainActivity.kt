package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var data = mutableListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvRecycleView)
        for (i in 1..15){
            val student = Student(
                "Name of student : $i",
                i,
                i * 2
            )
            data += student
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserRecycleViewAdapter(data)


    }
}