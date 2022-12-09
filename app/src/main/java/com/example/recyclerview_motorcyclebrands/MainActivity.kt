package com.example.recyclerview_motorcyclebrands

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_motorcyclebrands.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MyAdapter
    private lateinit var motorcycleList: ArrayList<MotorcycleList>
    private lateinit var recyclerView: RecyclerView
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataInitialize()
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(motorcycleList)

    }

    private fun dataInitialize(){
        motorcycleList = arrayListOf<MotorcycleList>()

        imageId = arrayOf(
            R.drawable.aprilla_logo,
            R.drawable.bmw_logo,
            R.drawable.cagiva_logo,
            R.drawable.ducati_logo,
            R.drawable.excelsior_logo,
            R.drawable.fantic_logo,
            R.drawable.gilera_logo,
            R.drawable.honda_logo,
            R.drawable.indian_logo,
            R.drawable.jawa_logo,
            R.drawable.kawasaki_logo
        )

        heading = arrayOf(
            getString(R.string.aprilia),
            getString(R.string.bmw),
            getString(R.string.cagiva),
            getString(R.string.ducati),
            getString(R.string.excelsior),
            getString(R.string.fantic),
            getString(R.string.gilera),
            getString(R.string.honda),
            getString(R.string.indian),
            getString(R.string.jawa),
            getString(R.string.kawasaki)
        )

        for (item in imageId.indices){
            val list = MotorcycleList(imageId[item],heading[item])
            motorcycleList.add(list)
        }
    }
}