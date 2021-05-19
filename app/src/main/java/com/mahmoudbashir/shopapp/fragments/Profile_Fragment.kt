package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentProfileBinding


class Profile_Fragment : Fragment() {

    lateinit var profBinding:FragmentProfileBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        profBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_profile_, container, false)
        goBack()

        return profBinding.root
    }

    private fun goBack(){
        profBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}