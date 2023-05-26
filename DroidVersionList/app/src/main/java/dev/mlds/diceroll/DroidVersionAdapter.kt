package dev.mlds.diceroll

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DroidVersionAdapter(var listaDeNomes: List<String>, var colors: Array<String>): RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Cria uma instancia do layout item_layout.xml - Cria uma classe em memoria baseada no xml
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
         return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        // Conhece quantas vezes o layout vai repetir na tela
        return listaDeNomes.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Junta os dados com a visualização - Sabe como organizar os dados na tela

        val nomeDaVersao = listaDeNomes[position]
        val cor = colors[position]
        holder.configItem(nomeDaVersao, position, cor)

    }
}