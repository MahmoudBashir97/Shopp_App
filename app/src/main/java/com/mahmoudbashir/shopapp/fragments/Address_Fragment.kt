package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentAddressBinding


class Address_Fragment : Fragment() {

    lateinit var addressBinding:FragmentAddressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        addressBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_address_, container, false)

        goBack()
        navigateToPaymentMethod()

        return addressBinding.root
    }

    private fun navigateToPaymentMethod() {
        addressBinding.btnContinueAddAddress.setOnClickListener {
        findNavController().navigate(Address_FragmentDirections.actionAddressFragmentToPaymentMtehtodFragment())
        }
    }

    private fun goBack() {
        addressBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}