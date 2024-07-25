package com.example.tutorapp.theory.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.tutorapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [theoryMain.newInstance] factory method to
 * create an instance of this fragment.
 */
class TheoryMain : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_theory_main, container, false)
    }
    companion object{
        @JvmStatic
        fun newInstance() = TheoryMain()
    }


}