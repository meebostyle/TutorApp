package com.example.tutorapp.mainAct.ui

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tutorapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {


    private lateinit var progressBar: FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        progressBar = findViewById(R.id.progressBar)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)


        bottomNavigationView.setupWithNavController(navController)

    }




}