package com.malaika.loam

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class navigationActivity2 : AppCompatActivity() {
    lateinit var home_btn: ImageView
    lateinit var shop_btn: ImageView
    lateinit var cart_btn: ImageView
    lateinit var profile_btn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navigation2)
        home_btn = findViewById<ImageView>(R.id.imageView_home)
        shop_btn = findViewById<ImageView>(R.id.imageView_shop)
        cart_btn = findViewById<ImageView>(R.id.imageView_cart)
        profile_btn = findViewById<ImageView>(R.id.imageView_profile)
        val home = HomeFragment.newInstance()
        val profile = ProfileFragment.newInstance()
        val cart = CartFragment.newInstance()
        val shop = ShopFragment.newInstance()
        home_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.first_container, home).commit()
        }
        shop_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.first_container, shop).commit()
        }
        cart_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.first_container, cart).commit()
        }
        profile_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.first_container, profile).commit()
        }
        supportFragmentManager.beginTransaction().replace(R.id.first_container,home).commit()

    }
}
