package com.shady.hw_week04_day01_recyclerviewiml

import android.content.res.TypedArray
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //    private lateinit var imageView: ImageView
    private lateinit var recyclerView: RecyclerView
    private var storesList = mutableListOf<Store>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* imageView = findViewById(R.id.ivStoreImage)
         imageView.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))*/
        val arr = resources.getStringArray(R.array.storeNames)
        val drawArr : TypedArray = resources.obtainTypedArray(R.array.draID)
        for (index in arr.indices) {
            storesList += Store(arr[index], Random.nextInt(0, 11).toString(),drawArr.getResourceId(index,0))
        }
        recyclerView = findViewById(R.id.rvRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StoreAdapter(storesList)
    }
}