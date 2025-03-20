package com.example.tutorapp.practice.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

import com.example.tutorapp.R
import com.example.tutorapp.databinding.FragmentPracticeMainBinding
import com.example.tutorapp.practice.domain.ViewPagerAdapter
import kotlin.math.abs

/**
 * A simple [Fragment] subclass.
 * Use the [accountMain.newInstance] factory method to
 * create an instance of this fragment.
 */
class PracticeMain : Fragment() {


    private var _binding: FragmentPracticeMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPracticeMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager2 = binding.pager

        viewPager2.adapter = ViewPagerAdapter()
        viewPager2.setPageTransformer { page, position ->
            val offset = 24f
            page.translationX = position * offset
            val scale = 1 - 0.1f * abs(position)
            page.scaleX = scale
            page.scaleY = scale



            page.alpha = 1 - 0.4f * abs(position)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object{
        @JvmStatic
        fun newInstance() = PracticeMain()
    }


}