package com.example.kidya

import android.content.Intent
import android.os.Bundle
import android.view.View

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kidya.databinding.ActivityMainBinding
import com.example.kidya.ui.LoginActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        setSupportActionBar(binding.appBar.toolbar)
        navView = binding.bottomNavView

        val drawerLayout=binding.drawerLayout
        actionBar?.setDisplayHomeAsUpEnabled(false)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        binding.appBar
        binding.appBar.hamburger.setOnClickListener{
            drawerLayout.openDrawer(GravityCompat.START)
        }
        binding.appBar.newsFragment.setOnClickListener {
            navController.navigate(R.id.action_navigation_home_to_newsFragment)
        }


        binding.appBar.notificationFragment.setOnClickListener {
            navController.navigate((R.id.action_navigation_home_to_notificationFragment))
        }

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_basket, R.id.navigation_favourite
            )
        )

        binding.navView.getHeaderView(0).setOnClickListener {
          startActivity(Intent(this,LoginActivity::class.java))
        }

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        NavigationUI.setupWithNavController(binding.navView,navController)


    }

    fun appBarHomeGone(){
        binding.appBar.hamburger.visibility = View.GONE
        binding.appBar.newsFragment.visibility = View.GONE
        binding.appBar.notificationFragment.visibility = View.GONE
        binding.appBar.searchIcon.visibility = View.VISIBLE
        binding.appBar.toolbar.title = "Hello"
//        binding.appBar.appbarTitle.visibility = View.VISIBLE


    }

    fun appBarHomeVisible(){
        binding.appBar.hamburger.visibility = View.VISIBLE
        binding.appBar.newsFragment.visibility = View.VISIBLE
        binding.appBar.notificationFragment.visibility = View.VISIBLE
        binding.appBar.searchIcon.visibility = View.GONE
        binding.appBar.toolbar.popupTheme = R.style.PopupMenu
//        binding.appBar.appbarTitle.visibility = View.GONE
    }

    fun hideBottomNav(){
        navView.visibility = View.GONE
    }

    fun showBottomNav(){
        navView.visibility = View.VISIBLE
    }
//вернуться назад при нажатии кнопки "назад" в appBar
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment_activity_main)
        return navController.navigateUp()

    }
}