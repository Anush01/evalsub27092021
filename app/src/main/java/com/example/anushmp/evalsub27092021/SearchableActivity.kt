package com.example.anushmp.evalsub27092021

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit

class SearchableActivity : AppCompatActivity() {

    lateinit var Rec : RecyclerView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchable)

        Rec = findViewById(R.id.rvsongs)

        var con: Context = this


        if (Intent.ACTION_SEARCH == intent.action) {
            intent.getStringExtra(SearchManager.QUERY)?.also { query ->
                doMySearch(query)
            }
        }

    }

    private fun doMySearch(query: String) {

        var Retrofitobj : Retrofit = Networker.getRetrofit()

        var api = Retrofitobj.create(Api::class.java)

        api.getResults(query).enqueue(object: Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {

                var resp: Response? = response.body()

                var listofsongs: List<Results> = ArrayList()

                if (resp != null) {
                    listofsongs = resp.results
                }



                var llm : LinearLayoutManager = LinearLayoutManager(parent)

                var addy: MusicAdapter = MusicAdapter(listofsongs)

                Rec.adapter = addy
                Rec.layoutManager = llm




            }

            override fun onFailure(call: Call<Response>, t: Throwable) {

            }


        })


    }
}