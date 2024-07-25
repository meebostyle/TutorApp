package com.example.tutorapp.learning.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.tutorapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [accountMain.newInstance] factory method to
 * create an instance of this fragment.
 */
class LearningMain : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learning_main, container, false)
    }
    companion object{
        @JvmStatic
        fun newInstance() = LearningMain()
    }


}