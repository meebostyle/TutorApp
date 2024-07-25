package com.example.tutorapp.theory.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.tutorapp.R
import com.example.tutorapp.theory.domain.AdapterForTheory
import com.example.tutorapp.theory.domain.NameForTheme

/**
 * A simple [Fragment] subclass.
 * Use the [theoryMain.newInstance] factory method to
 * create an instance of this fragment.
 */
class TheoryMain : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_theory_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val themeList: RecyclerView = view.findViewById(R.id.themesList)
        val themes = arrayListOf<NameForTheme>()

        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))
        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))
        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))

        themeList.layoutManager = LinearLayoutManager(requireContext())
        themeList.adapter = AdapterForTheory(themes, requireContext())

    }
    companion object{
        @JvmStatic
        fun newInstance() = TheoryMain()
    }


}