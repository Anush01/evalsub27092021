package com.example.anushmp.evalsub27092021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class SearchableActivity : AppCompatActivity() {

    lateinit var Rec : RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchable)

        Rec = findViewById(R.id.rvsongs)

    }
}