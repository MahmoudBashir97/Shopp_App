package com.mahmoudbashir.shopapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mahmoudbashir.shopapp.R

class orders_adapter: RecyclerView.Adapter<orders_adapter.ViewHolder>() {

    var mlist= arrayOf("T-shirt","Melton","Pants","Jacket - Sweet")
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.single_item_orders_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = mlist.size
}