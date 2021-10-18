package com.example.recyclerview_hw_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var data = mutableListOf<Animal>()
    private lateinit var petNameList:List<String>
    private lateinit var petTypeList:List<String>
    private var petImagesList=arrayOf(
    R.drawable.balinese,
    R.drawable.beagle,
    R.drawable.birman,
    R.drawable.british_shorthair_cat,
    R.drawable.cane_corso,
    R.drawable.chartreux,
    R.drawable.french_bulldog,
    R.drawable.golden_retriever,
    R.drawable.himalayan,
    R.drawable.khao_manee,
    R.drawable.pomeranian,
    R.drawable.pug,
    R.drawable.ragdoll_cat,
    R.drawable.siberian_husky,
    R.drawable.yorkshire_terrier
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.MyRecycleView)
        petNameList = resources.getStringArray(R.array.PetNameArray).toList()
        petTypeList = resources.getStringArray(R.array.PetTypeArray).toList()


        for (i in 0..14){
            val animal=Animal(
                "Pet ID: 10+$i",
                petNameList[i],
                petTypeList[i],
                petImagesList[i]
            )
            data+=animal
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(data)

    }
}