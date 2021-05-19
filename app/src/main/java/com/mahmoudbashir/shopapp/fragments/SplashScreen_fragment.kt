package com.mahmoudbashir.shopapp.fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mahmoudbashir.shopapp.ui.MainActivity
import com.mahmoudbashir.shopapp.R
import com.mahmoudbashir.shopapp.databinding.FragmentSplashScreenFragmentBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashScreen_fragment : AppCompatActivity() {

    lateinit var splashBinding:FragmentSplashScreenFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.parseColor("#64B6FF")
        window.navigationBarColor = Color.TRANSPARENT
        window.addFlags(android.view.WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        splashBinding = DataBindingUtil.setContentView(this, R.layout.fragment_splash_screen_fragment)
        gotoWelcomeScreen()
    }

    private fun gotoWelcomeScreen(){
        GlobalScope.launch(Dispatchers.Main) {
            delay(2000)
            val i : Intent = Intent(this@SplashScreen_fragment, MainActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(i)
            finish()
        }
    }

}