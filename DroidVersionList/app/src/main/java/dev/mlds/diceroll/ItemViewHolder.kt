package dev.mlds.diceroll

import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var tvItemVersionName: TextView
    private var clContainer: ConstraintLayout

    init {
        tvItemVersionName = itemView.findViewById(R.id.tvItemVersionName)
        clContainer = itemView.findViewById(R.id.clContainer)
    }

    fun configItem(nomeDaVersao: String, position: Int, cor: String) {
        // Preencher futuramente!
        tvItemVersionName.text = nomeDaVersao

        val color = Color.parseColor(cor)
        clContainer.setBackgroundColor(color)

        clContainer.setOnClickListener {
            // Executar a ação de click!
            Toast.makeText(itemView.context, "Você clicou em $nomeDaVersao na posição $position", Toast.LENGTH_LONG).show()
        }
    }

}