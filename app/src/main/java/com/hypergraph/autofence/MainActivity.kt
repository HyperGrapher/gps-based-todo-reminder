package com.hypergraph.autofence

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavOptions

import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        setUpNavigation()

    }

    private fun setUpNavigation() {

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.inflateMenu(R.menu.bottom_menu)


        val navController = findNavController(R.id.nav_host_fragment)

        navView.setupWithNavController(navController)

        val navOptions = NavOptions.Builder()
            .setLaunchSingleTop(true)  // Used to prevent multiple copies of the same destination
            .setEnterAnim(R.anim.nav_default_enter_anim)
            .setExitAnim(R.anim.nav_default_exit_anim)
            .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
            .build()


        fabCreateMap.setOnClickListener {
            println("btn")
            navController.navigate(R.id.navigation_create_map, null, navOptions)

        }
    }


}
