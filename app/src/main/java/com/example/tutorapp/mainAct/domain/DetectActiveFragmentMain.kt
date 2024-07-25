package com.example.tutorapp.mainAct.domain

import android.view.View
import com.example.tutorapp.R

fun DetectActiveFragmentMain(view: View): String {
    when (view.id){
        (R.id.goToTheory) -> return "theory"
        (R.id.goToAccount) -> return "account"
        (R.id.goToPractice) -> return "practice"
        (R.id.goToLearning) -> return "learning"
    }
    return ""
}