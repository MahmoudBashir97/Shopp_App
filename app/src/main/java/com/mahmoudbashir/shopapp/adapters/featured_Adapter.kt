package com.mahmoudbashir.shopapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.clicksInterface.ClickItemsInterface
import com.squareup.picasso.Picasso

class featured_Adapter(val clickItemsInterface: ClickItemsInterface): RecyclerView.Adapter<featured_Adapter.ViewHolder>() {
    var mlist= arrayOf("T-shirt","Melton","Pants","Jacket - Sweet")
    var imgs= arrayOf(R.drawable.men_cat_pic,
            R.drawable.men_cat_pic,
            R.drawable.men_cat_pic,
            R.drawable.men_cat_pic)
    var prices= arrayOf("500 $","200 $","300 $","400 $")

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val product_img = itemView.findViewById<ImageView>(R.id.product_img)
        val txt_price = itemView.findViewById<TextView>(R.id.txt_price)
        val txt_product_name = itemView.findViewById<TextView>(R.id.txt_product_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.single_product_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(imgs[position]).into(holder.product_img)
        holder.txt_price.text = prices[position]
        holder.txt_product_name.text = mlist[position]
        holder.itemView.setOnClickListener {
            clickItemsInterface.onClickItem(position)
        }
    }

    override fun getItemCount(): Int = mlist.size
}