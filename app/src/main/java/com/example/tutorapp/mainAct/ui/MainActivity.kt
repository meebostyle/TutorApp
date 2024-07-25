package com.example.tutorapp.mainAct.ui

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tutorapp.R
import com.example.tutorapp.mainAct.domain.FragmentChanger
import com.example.tutorapp.theory.ui.TheoryMain

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentViewHolder, TheoryMain.newInstance())
            .commit()


    }

    fun ChangeFragment(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentViewHolder, FragmentChanger(view))
            .commit()
    }

}