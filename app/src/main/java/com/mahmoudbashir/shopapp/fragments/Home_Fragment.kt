package com.mahmoudbashir.shopapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.google.android.material.navigation.NavigationView
import com.mahmoudbashir.shopapp.R

class Home_Fragment : Fragment() {

    lateinit var drawer:DrawerLayout
    lateinit var open_menu:ImageView
    lateinit var nav_view:NavigationView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_home_, container, false)
        drawer = v.findViewById(R.id.drawer_layout)
        open_menu = v.findViewById(R.id.open_menu)
        nav_view  = v.findViewById(R.id.nav_view)

        initializationHeader()
        open_menu.setOnClickListener {
            drawer.open()
        }
        return v
    }
    private fun initializationHeader(){
        //init for Nav Header
        val headerView = nav_view.getHeaderView(0)
        val nav_home = headerView.findViewById<TextView>(R.id.home_btn)
        val nav_profile = headerView.findViewById<TextView>(R.id.profile_btn)
        val nav_cart = headerView.findViewById<TextView>(R.id.mycart_btn)
        val nav_fav = headerView.findViewById<TextView>(R.id.fav_btn)
        val nav_orders = headerView.findViewById<TextView>(R.id.orders_btn)
        val nav_lang = headerView.findViewById<TextView>(R.id.lang_btn)
        val nav_settings = headerView.findViewById<TextView>(R.id.settings_btn)


        nav_home.setOnClickListener {
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_profile.setOnClickListener {
            findNavController().navigate(Home_FragmentDirections.actionHomeFragmentToProfileFragment())
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_cart.setOnClickListener {
            findNavController().navigate(Home_FragmentDirections.actionHomeFragmentToCartFragment())
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_fav.setOnClickListener {
            findNavController().navigate(Home_FragmentDirections.actionHomeFragmentToFavouriteFragment())
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_orders.setOnClickListener {
            findNavController().navigate(Home_FragmentDirections.actionHomeFragmentToOrdersFragment())
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_lang.setOnClickListener {
            drawer.closeDrawer(GravityCompat.START)
        }

        nav_settings.setOnClickListener {
            drawer.closeDrawer(GravityCompat.START)
        }
    }
}