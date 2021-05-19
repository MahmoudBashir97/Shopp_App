package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentOrdersBinding


class Orders_Fragment : Fragment() {

    lateinit var ordersBinding: FragmentOrdersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ordersBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_orders_, container, false)
        goBack()
        return ordersBinding.root
    }
    private fun goBack(){
        ordersBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}