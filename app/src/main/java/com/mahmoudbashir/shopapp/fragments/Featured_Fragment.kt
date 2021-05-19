package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentFeaturedBinding


class Featured_Fragment : Fragment() {

    lateinit var featBinding: FragmentFeaturedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        featBinding  = DataBindingUtil.inflate(inflater,R.layout.fragment_featured_, container, false)
        goBack()

        return featBinding.root

    }

    private fun goBack(){
        featBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}