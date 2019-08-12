package com.seizetheday.filtering.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seizetheday.filtering.R

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onBindData(item: String) {
        itemView.findViewById<TextView>(R.id.tv_item).text = item
    }
}