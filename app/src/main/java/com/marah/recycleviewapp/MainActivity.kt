package com.marah.recycleviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var chart: MutableList<Item> = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rvRecycleView)
        for(i in 1..15){
            val user = Item("itemName $i","price $i")
            chart += user
        }


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserRecycleViewAdapter(chart)

    }
}