package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentProductDetailsBinding

class ProductDetails_Fragment : Fragment() {
    lateinit var prodetailsBinding:FragmentProductDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        prodetailsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_product_details_, container, false)

        goBack()
        return prodetailsBinding.root
    }

    private fun goBack(){
        prodetailsBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}