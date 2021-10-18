package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyView: RecyclerView

    private var listItem = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyView = findViewById(R.id.recyView)
        for (i in 1..50) {
            val user = Item(i+100,  i + 40)
            listItem.add(user)
        }
        recyView.layoutManager = LinearLayoutManager(this)
        recyView.adapter = ItemRecycleViewAdapter(listItem)
    }
}