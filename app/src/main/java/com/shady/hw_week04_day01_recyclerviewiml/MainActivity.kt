package com.example.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shady.hw_week04_day01_recyclerviewiml.R

class MainActivity : AppCompatActivity() {

    private  var  layoutManager:RecyclerView.LayoutManager? = null
    private  var  adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        review.layoutManager= layoutManager

        adapter=RecyclerAdapter()

        recyclerView.adapter=adapter


    }
}