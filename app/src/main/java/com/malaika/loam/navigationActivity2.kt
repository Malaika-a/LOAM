package com.malaika.loam

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class navigationActivity2 : AppCompatActivity() {
    lateinit var home_btn: ImageView
    lateinit var shop_btn: ImageView
    lateinit var cart_btn: ImageView
    lateinit var profile_btn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navigation2)
        val navHostFragment = NavHostFragment.create(R.navigation.nav_graph)
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, navHostFragment)
            .setPrimaryNavigationFragment(navHostFragment)
            .commitNow()
       val navController = navHostFragment.navController


        val bottomnav=findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomnav.setupWithNavController(navController)}}




