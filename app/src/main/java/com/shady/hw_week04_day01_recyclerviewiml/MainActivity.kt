package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    private var data: MutableList<UserData> = mutableListOf<UserData> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvRecyclerView)
        data[0] = UserData("Abdulaziz", "Alhothali",1,"05xxxxxxx1")
        data[1] = UserData("Abdullah", "Almohaimeed",2,"05xxxxxxx2")
        data[2] = UserData("Abdullah", "Alshehri",3,"05xxxxxxx3")
        data[3] = UserData("Abeer", "Alghamdi",4,"05xxxxxxx4")
        data[4] = UserData("Afnan", "Almohammadi",5,"05xxxxxxx5")
        data[5] = UserData("Asma", "Alghamdi",6,"05xxxxxxx6")
        data[6] = UserData("Badr", "Fadul",7,"05xxxxxxx7")
        data[7] = UserData("Bashayer", "Alosaimi",8,"05xxxxxxx8")
        data[8] = UserData("Basil", "Alluqmani",9,"05xxxxxxx9")
        data[9] = UserData("Faisal", "Alharthi",10,"05xxxxxx10")
        data[10] = UserData("Faisal", "Alqahtani",11,"05xxxxxx11")
        data[11] = UserData("Fatimah", "Asim?",12,"05xxxxxx12")
        data[12] = UserData("Hani", "Dabash",13,"05xxxxxx13")
        data[13] = UserData("Husam", "Metro",14,"05xxxxxx14")
        data[14] = UserData("Mahila", "Almutairi",15,"05xxxxxx15")
        data[15] = UserData("Marah", "Albossi",16,"05xxxxxx16")
        data[16] = UserData("Musab", "Alghamdi",17,"05xxxxxx17")
        data[17] = UserData("Nadia", "Almarashi",18,"05xxxxxx18")
        data[18] = UserData("Rana", "Alrajhi",19,"05xxxxxx19")
        data[19] = UserData("Randah", "Almajnooni",20,"05xxxxxx20")
        data[20] = UserData("Renad", "Alqurashi",21,"05xxxxxx21")
        data[21] = UserData("Roula", "Allubdi",22,"05xxxxxx22")
        data[22] = UserData("Ruba", "Omar",23,"05xxxxxx23")
        data[23] = UserData("Sami", "Siam",24,"05xxxxxx24")
        data[24] = UserData("Shahad", "Alsayed",25,"05xxxxxx25")
        data[25] = UserData("Suzanne", "Saleem",26,"05xxxxxx26")
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserRecyclerViewAdapter(data)

    }
}