package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentCheckoutBinding


class Checkout_Fragment : Fragment() {

    lateinit var checkBinding: FragmentCheckoutBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        checkBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_checkout_, container, false)
        goBack()
        buyDone_navigateToConfirmationScreen()

        return checkBinding.root
    }

    private fun buyDone_navigateToConfirmationScreen() {
       checkBinding.btnBuyDone.setOnClickListener {
           findNavController().navigate(Checkout_FragmentDirections.actionCheckoutFragmentToConfirmationFragment())
       }
    }

    private fun goBack(){
        checkBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}