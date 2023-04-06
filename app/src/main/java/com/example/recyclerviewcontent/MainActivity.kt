package com.example.recyclerviewcontent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gojou,
                " Gojou",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.deku,
                " Deku",
            " lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.geto,
                "Geto",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.maki,
                "Maki",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.itadori,
                "Itadori",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nanami,
                "Nanami",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.megumi,
                "Megumi",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.sukuna,
                "Sukuna",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.tanjiro,
                "Tanjiro",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.mahito,
                "Mahito",
                "lorem lipsum lorem lipsum lorem lipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter(this, superheroList){

        }
    }
}