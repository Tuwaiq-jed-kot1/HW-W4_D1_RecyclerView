package com.example.hw1weak4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shady.hw_week04_day01_recyclerviewiml.R
import layout.Cart

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private  var data = mutableListOf<Cart>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycle)
        for (i in 0..15){
            val cart=Cart(
                "product $i",
                "Coloor $i",
                "Price $i"

            )
            data+=cart
        }
        CartRecycleViewAdapter.layoutManager=LinearLayoutManager(this)
        CartRecycleViewAdapter.adapter=CartAdapter(data)
    }
}