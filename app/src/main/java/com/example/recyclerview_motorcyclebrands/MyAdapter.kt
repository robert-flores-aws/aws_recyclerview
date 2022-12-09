package com.example.recyclerview_motorcyclebrands

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val motorcycleList : ArrayList<MotorcycleList>) :
        RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val v: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent, false)
            return MyViewHolder(v)
        }

        override fun getItemCount(): Int {
            return motorcycleList.size
        }

        override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
            val currentItem = motorcycleList[position]
            holder.titleImage.setImageResource(currentItem.titleImage)
            holder.txtHeading.text = currentItem.txtHeading
        }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val txtHeading : TextView = itemView.findViewById(R.id.tvHeading)

        init {
            itemView.setOnClickListener { v: View ->
                Toast.makeText(itemView.context, "You selected ${txtHeading.text}", Toast.LENGTH_SHORT).show()
            }
        }

    }


}