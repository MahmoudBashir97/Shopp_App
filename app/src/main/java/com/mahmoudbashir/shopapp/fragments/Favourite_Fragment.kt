package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.adapters.featured_Adapter
import com.mahmoudbashir.shopapp.clicksInterface.ClickItemsInterface
import com.mahmoudbashir.shopapp.databinding.FragmentFavouriteBinding


class Favourite_Fragment : Fragment() ,ClickItemsInterface{

    lateinit var favBinding:FragmentFavouriteBinding
    lateinit var adapt:featured_Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        favBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_favourite_, container, false)
        setupRec()
        goBack()


        return favBinding.root
    }

    private fun goBack(){
        favBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setupRec(){
        adapt = featured_Adapter(this)
        favBinding.recFav.apply {
            setHasFixedSize(true)
            adapter = adapt
        }
    }

    override fun onClickItem(index: Int) {
        findNavController().navigate(Favourite_FragmentDirections.actionFavouriteFragmentToProductDetailsFragment())
    }

}