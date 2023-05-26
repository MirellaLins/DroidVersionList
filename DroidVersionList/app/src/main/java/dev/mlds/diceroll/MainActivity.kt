package dev.mlds.diceroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeNomes = listOf(
            "Texto 1",
            "Texto 2",
            "Texto 3",
            "Texto 4",
            "Texto 5",
            "Texto 6",
            "Texto 7"
        )

        val colors = resources.getStringArray(R.array.colors)

        val recycler = findViewById<RecyclerView>(R.id.rvListaDeVersoes)
        recycler.adapter = DroidVersionAdapter(listaDeNomes, colors)

    }
}