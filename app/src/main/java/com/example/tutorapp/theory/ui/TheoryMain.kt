package com.example.tutorapp.theory.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.tutorapp.R
import com.example.tutorapp.mainAct.domain.DetectActiveFragmentMain
import com.example.tutorapp.mainAct.domain.FragmentChanger
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

        val backButton: AppCompatButton = view.findViewById(R.id.backButton)
        val cardContainer: FragmentContainerView = view.findViewById(R.id.detailedCardContainer)

        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))
        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))
        themes.add(NameForTheme(1, "disckriminant", "Квадратные уравнения", "Подробное описание"))

        backButton.setOnClickListener {
            cardContainer.visibility = View.GONE
            backButton.visibility = View.GONE
        }


        themeList.layoutManager = LinearLayoutManager(requireContext())
        themeList.adapter = AdapterForTheory(themes, requireContext(),childFragmentManager, backButton, cardContainer)

    }
    companion object{
        @JvmStatic
        fun newInstance() = TheoryMain()
        @JvmStatic
        fun startDetailedFragment(fragmentManager: FragmentManager, containerId: Int, fragment: Fragment) {
            fragmentManager.beginTransaction()
                .replace(containerId, fragment)
                .commit()
        }
    }





}