package com.seizetheday.filtering.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seizetheday.filtering.R
import com.seizetheday.filtering.viewholders.ItemViewHolder

class ItemAdapter(items: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {

    val itemList = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewholder_item, parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBindData(itemList[position])
    }

}


