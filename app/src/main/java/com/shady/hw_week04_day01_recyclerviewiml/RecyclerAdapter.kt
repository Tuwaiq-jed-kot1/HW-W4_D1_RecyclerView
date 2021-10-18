package com.example.myhomework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shady.hw_week04_day01_recyclerviewiml.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private  var title = arrayOf("سورة الفاتحة" , "سورة البقرة ", " سورة ال عمران"   , " سورة النساء" , "سورة المائدة", "سورة الانعام " , "سورة الاعراف " , "سورة الانفال" , "سورة التوبة" , "سورةيونس " , "سورة هود " , "سورة يوسف" , "سورة الرعد " , "سورة إبراهيم" , "سورة الحجر"   )

    private  val  details= arrayOf("سورة مكية " , "سورة مدينة", "سورة مدينة"   , "سورة مدينة"  , "سورة مدينة" , "سورة مكية " , "سورة مكية " , "سورة مدينة"  , "سورة مدينة" , "سورة مكية " , "سورة مكية " , "سورة مكية" , "سورة مدينة " , "سورةمكية" , "سورة مكية"   )

    private  val  images= arrayOf(R.drawable.images,R.drawable.images , R.drawable.images  , R.drawable.images , R.drawable.images  , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images , R.drawable.images  )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.city_travel,parent,false)
           return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
     holder.itemTitle.text= title[position]
     holder.itemDetail.text= details[position]
     holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
     return  title.size
    }


    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        lateinit var itemImage:ImageView
        lateinit var itemTitle:TextView
        lateinit var itemDetail:TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)


        }
    }
}