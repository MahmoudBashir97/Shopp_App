package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentWelcomeScreenBinding

class WelcomeScreen_Fragment : Fragment() {

    lateinit var welcomeBinding:FragmentWelcomeScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        welcomeBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_welcome_screen_, container, false)

        // navigate to registeration screen by passing parameter for the destination fragment (login) / (signup)
        goToRegisterationScreenAsLogin()
        goToRegisterationScreenAsSignUp()

        return welcomeBinding.root
    }
    private fun goToRegisterationScreenAsLogin(){
        welcomeBinding.loginBtn.setOnClickListener {
            findNavController().navigate(
                WelcomeScreen_FragmentDirections.actionWelcomeScreenFragmentToRegisterationFragment(
                    "login"
                )
            )
        }
    }

    private fun goToRegisterationScreenAsSignUp(){
        welcomeBinding.signUpBtn.setOnClickListener {
            findNavController().navigate(
                WelcomeScreen_FragmentDirections.actionWelcomeScreenFragmentToRegisterationFragment(
                    "signup"
                )
            )
        }
    }
}