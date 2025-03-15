package com.example.tutorapp.theory.domain

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorapp.R
import com.example.tutorapp.theory.ui.DetailedTheory
import com.example.tutorapp.theory.ui.TheoryMain

class AdapterForTheory(private var name: List<NameForTheme>, var context: Context,
                       private val fragmentManager: FragmentManager,
                       private val backButton: AppCompatButton,
                       private val cardDetailedContainer: FragmentContainerView
    ):
    RecyclerView.Adapter<AdapterForTheory.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemListForm: TextView = itemView.findViewById(R.id.itemListFormula)
        val imageFormula: ImageView = itemView.findViewById(R.id.imageFormula)
        val itemListDesc: TextView = itemView.findViewById(R.id.itemListDesc)
        val cardContainer: LinearLayout = itemView.findViewById(R.id.cardContainer)
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
        holder.cardContainer.setOnClickListener {
            backButton.visibility = View.VISIBLE
            cardDetailedContainer.visibility = View.VISIBLE

            TheoryMain.startDetailedFragment(fragmentManager,cardDetailedContainer.id, DetailedTheory.newInstance())
        }


    }

}