package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentPaymentMtehtodBinding


class PaymentMtehtod_Fragment : Fragment() {

    lateinit var paymentBinding:FragmentPaymentMtehtodBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        paymentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_payment_mtehtod, container, false)

        goBack()
        navigateToCheckoutScreen()
        return paymentBinding.root
    }

    private fun navigateToCheckoutScreen() {
        paymentBinding.btnCheckout.setOnClickListener {
            findNavController().navigate(PaymentMtehtod_FragmentDirections.actionPaymentMtehtodFragmentToCheckoutFragment())
        }
    }

    private fun goBack() {
        paymentBinding.btnBack.setOnClickListener {
        findNavController().navigateUp()}
    }
}