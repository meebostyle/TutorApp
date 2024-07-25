package com.example.tutorapp.theory.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorapp.R
import com.example.tutorapp.theory.domain.NameForTheme

class AdapterForTheory(private var name: List<NameForTheme>, var context: Context):
    RecyclerView.Adapter<AdapterForTheory.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemListForm: TextView = itemView.findViewById(R.id.itemListFormula)
        val imageFormula: ImageView = itemView.findViewById(R.id.imageFormula)
        val itemListDesc: TextView = itemView.findViewById(R.id.itemListDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.theory_main_recycler_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return name.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageId = context.resources.getIdentifier(
            name[position].image,
            "drawable",
            context.packageName,
        )

        holder.imageFormula.setImageResource(imageId)
        holder.itemListForm.text = name[position].theme
        holder.itemListDesc.text = name[position].desc

    }

}