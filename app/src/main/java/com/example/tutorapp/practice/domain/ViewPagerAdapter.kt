package com.example.tutorapp.practice.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorapp.R

class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    private val images = intArrayOf(
        R.drawable.pic1,
        R.drawable.pic2,
        R.drawable.pic3,
        R.drawable.pic4,
        R.drawable.pic5,

    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        val imgView = findViewById<ImageView>(R.id.iv_pager)
        imgView.setImageResource(images[position])

    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)