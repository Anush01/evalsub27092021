package com.example.anushmp.evalsub27092021

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MusicVH(itemView: View): RecyclerView.ViewHolder(itemView) {



    fun setData(res: Results){

        itemView.findViewById<TextView>(R.id.songname).text = res.trackName + " " + res.artistName

        var iv = itemView.findViewById<ImageView>(R.id.songimage)

        Glide.with(itemView).load(res.artworkUrl100).into(iv)






    }

}