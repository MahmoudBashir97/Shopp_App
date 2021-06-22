package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.adapters.cart_Adapter
import com.mahmoudbashir.shopapp.databinding.FragmentCartBinding

class Cart_Fragment : Fragment() {
    lateinit var cartBinding:FragmentCartBinding
    lateinit var adapt :cart_Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        cartBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_cart_, container, false)
        setupRec()
        goBack()


        return cartBinding.root
    }

    private fun goBack(){
        cartBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
    private fun setupRec(){
        adapt = cart_Adapter()
        cartBinding.recCart.apply {
            setHasFixedSize(true)
            adapter = adapt
        }
    }
}