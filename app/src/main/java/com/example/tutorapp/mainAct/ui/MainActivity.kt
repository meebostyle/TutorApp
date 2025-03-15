package com.example.tutorapp.mainAct.ui

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction
import com.example.tutorapp.R
import com.example.tutorapp.mainAct.domain.DetectActiveFragmentMain
import com.example.tutorapp.mainAct.domain.FragmentChanger
import com.example.tutorapp.theory.ui.TheoryMain

class MainActivity : AppCompatActivity() {


    private lateinit var progressBar: FrameLayout

    private var activeFragmentMain = "theory"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        progressBar = findViewById(R.id.progressBar)

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

    fun changeFragment(view: View) {
        if (activeFragmentMain != DetectActiveFragmentMain(view)){
        progressBar.visibility = View.VISIBLE
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentViewHolder, FragmentChanger(view))
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .runOnCommit {
                progressBar.visibility = View.GONE
            }
            .commit()
        }
        activeFragmentMain = DetectActiveFragmentMain(view)
    }


}