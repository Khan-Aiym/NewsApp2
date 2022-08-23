package com.geektech.newsapp.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.newsapp.R
import com.geektech.newsapp.databinding.FragmentProfileBinding


class BoardFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentProfileBinding.inflate(layoutInflater, container,false)
        return binding.root
}}