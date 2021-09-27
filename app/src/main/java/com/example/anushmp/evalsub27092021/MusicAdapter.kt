package com.example.anushmp.evalsub27092021

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(val listofsongs:List<Results>): RecyclerView.Adapter<MusicVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicVH {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)



        return MusicVH(view)



    }

    override fun onBindViewHolder(holder: MusicVH, position: Int) {

        holder.setData(listofsongs.get(position))

    }

    override fun getItemCount(): Int {
        return listofsongs.size
    }
}