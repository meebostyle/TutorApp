package com.example.tutorapp.mainAct.domain


import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tutorapp.R
import com.example.tutorapp.account.ui.AccountMain
import com.example.tutorapp.learning.ui.LearningMain
import com.example.tutorapp.practice.ui.PracticeMain
import com.example.tutorapp.theory.ui.TheoryMain

fun FragmentChanger(view: View): Fragment {
         when (view.id) {
        R.id.goToTheory -> {
            Log.d("click", "theory")
            return TheoryMain.newInstance()
        }
        R.id.goToAccount -> {
            Log.d("click", "acc")
            return AccountMain.newInstance()
        }

        R.id.goToLearning -> {
            Log.d("click", "learn")
            return LearningMain.newInstance()
        }

        R.id.goToPractice -> {
            Log.d("click", "practice")
            return PracticeMain.newInstance()
        }
    }
    return TheoryMain.newInstance()
}