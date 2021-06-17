package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentConfirmationBinding


class Confirmation_Fragment : Fragment() {

    lateinit var confBinding: FragmentConfirmationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         confBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirmation_, container, false)
        backToHome()
        return confBinding.root
    }
    private fun backToHome(){
        confBinding.backToHomeBtn.setOnClickListener {

        }
    }
}