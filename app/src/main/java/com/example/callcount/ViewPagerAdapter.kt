package com.example.callcount

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(val pictures: List<Int>) :RecyclerView.Adapter<ViewPagerAdapter.ImageHolder>(){
    inner class ImageHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageHold= itemView.findViewById<ImageView>(R.id.ivPic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager,parent,false)
        return ImageHolder(view)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        val image = pictures[position]
        holder.imageHold.setImageResource(image)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}