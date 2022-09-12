package com.geektech.newsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.newsapp.databinding.ItemNewsBinding
import com.geektech.newsapp.databinding.PagerBoardBinding
import com.geektech.newsapp.databinding.ViewPagerBinding
import com.geektech.newsapp.models.News

class BoardAdapter : RecyclerView.Adapter<BoardAdapter.ViewHolder>() {

    inner class
    ViewHolder(private var binding: PagerBoardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(PagerBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount()  = 3

    }

