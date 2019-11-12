package com.hypergraph.autofence

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hypergraph.autofence.views.CurvedBottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val curvedBottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)


        fabMain.setOnClickListener {
            println("btn")

        }

    }

}
