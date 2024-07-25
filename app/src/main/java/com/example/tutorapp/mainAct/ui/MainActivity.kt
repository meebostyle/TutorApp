package com.example.tutorapp.mainAct.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tutorapp.R
import com.example.tutorapp.account.ui.AccountMain
import com.example.tutorapp.learning.ui.LearningMain
import com.example.tutorapp.practice.ui.PracticeMain
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
        when (view.id) {
            R.id.goToTheory -> {
                Log.d("click", "theory")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentViewHolder, TheoryMain.newInstance())
                    .commit()
            }
            R.id.goToAccount -> {
                Log.d("click", "acc")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentViewHolder, AccountMain.newInstance())
                    .commit()
            }
            R.id.goToLearning -> {
                Log.d("click", "learn")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentViewHolder, LearningMain.newInstance())
                    .commit()
            }
            R.id.goToPractice -> {
                Log.d("click", "practice")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentViewHolder, PracticeMain.newInstance())
                    .commit()
            }
        }
    }

}