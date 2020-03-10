package com.example.homeworkfour.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkfour.R
import com.example.homeworkfour.model.Shoe
import kotlinx.android.synthetic.main.shopping_items.view.*

class ShoeAdapter(var shoelist:ArrayList<Shoe>):RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>(){


    inner class  ShoeViewHolder(itemview:View):
        RecyclerView.ViewHolder(itemview){
        fun bindShoe(person: Shoe){
            itemView.txtName.text=person.name
            itemView.txtPrice.text=person.price
            itemView.image.setImageResource(person.shoeGallery)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        var view=LayoutInflater.from(parent.context)
            .inflate(R.layout.shopping_items,parent,false)
        return  ShoeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoelist.size
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.bindShoe(shoelist[position])
    }


}
