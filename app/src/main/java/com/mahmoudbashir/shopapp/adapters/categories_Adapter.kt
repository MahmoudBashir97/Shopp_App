package com.mahmoudbashir.shopapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mahmoudbashir.shopapp.R
import com.squareup.picasso.Picasso

class categories_Adapter() : RecyclerView.Adapter<categories_Adapter.ViewHolder>() {
    var mlist= arrayOf("Women","Men","Kids")
    var imgs= arrayOf(R.drawable.women_cat_pic,
    R.drawable.men_cat_pic,
    R.drawable.kids_cat_pic)
    var backsimg= arrayOf(R.drawable.cat_back,
            R.drawable.cat_back2,
            R.drawable.cat_back3)


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txt_title_cat = itemView.findViewById<TextView>(R.id.txt_title_cat)
        val rel_back_cat = itemView.findViewById<RelativeLayout>(R.id.rel_bck)
        val img_cat = itemView.findViewById<ImageView>(R.id.img_cat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.single_cat_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(imgs[position]).into(holder.img_cat)
        holder.rel_back_cat.setBackgroundResource(backsimg[position])
        holder.txt_title_cat.text = mlist[position]
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}