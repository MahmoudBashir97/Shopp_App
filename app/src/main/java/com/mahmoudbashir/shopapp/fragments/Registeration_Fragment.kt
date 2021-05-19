package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentRegisterationBinding


class Registeration_Fragment : Fragment() {

    lateinit var registBinding:FragmentRegisterationBinding
    var regist_sort:String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        registBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_registeration_, container, false)
        regist_sort = arguments?.let { Registeration_FragmentArgs.fromBundle(it).registerSort }
        // do back stack for previous fragment(screen)
        back_btn()
        regist_sort?.let { check(it) }
        btnChecking()
        toHomeScreen()




        return registBinding.root
    }

    private fun back_btn(){
        registBinding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun check(status:String){
        registBinding.isLogin = status == "login"
        val st = registBinding.isLogin
        if (st != true){
            registBinding.txtRegistTitle.text = "Signup"
            registBinding.loginBtn.text = "Sign Up"
            registBinding.txtRegistQ.text = "Already have an account?"
            registBinding.toSignBtn.text = "sign in"
        }
    }
    private fun btnChecking(){
        registBinding.toSignBtn.setOnClickListener {
            if (registBinding.toSignBtn.text.equals("Signup")){
                registBinding.txtRegistTitle.text = "Signup"
                registBinding.txtRegistQ.text = "Already have an account?"
                registBinding.toSignBtn.text = "sign in"
                registBinding.isLogin = false
                registBinding.loginBtn.text = "Sign Up"
            }else if(registBinding.toSignBtn.text.equals("sign in")){
                registBinding.txtRegistTitle.text = "Login"
                registBinding.txtRegistQ.text = "Don't have an account?"
                registBinding.toSignBtn.text = "Signup"
                registBinding.isLogin = true
                registBinding.loginBtn.text = "Login"
            }
        }
    }

    private fun toHomeScreen(){
       registBinding.loginBtn.setOnClickListener {
           findNavController().navigate(Registeration_FragmentDirections.actionRegisterationFragmentToHomeFragment())
       }
    }

}