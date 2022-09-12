package com.geektech.newsapp.ui.board

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.annotation.NonNull
import androidx.core.view.isInvisible
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.geektech.newsapp.MainActivity
import com.geektech.newsapp.R
import com.geektech.newsapp.databinding.ItemNewsBinding
import com.geektech.newsapp.databinding.PagerBoardBinding
import com.geektech.newsapp.databinding.ViewPagerBinding
import com.geektech.newsapp.models.News
import com.geektech.newsapp.ui.home.HomeFragment
import com.geektech.newsapp.ui.home.NewsAdapter
import com.geektech.newsapp.ui.models.Board
import java.util.logging.Handler

class BoardAdapter : RecyclerView.Adapter<BoardAdapter.ViewHolder>() {
    private val titles = arrayOf("Hello", "Привет", "Салам")

    inner class  ViewHolder(private var binding : PagerBoardBinding )
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {

        }
    }

    fun bind (position: Int) {
        binding.textTitle.text =titles[position]
    }

    fun onCreatyViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(PagerBoardBinding.inflate(LayoutInflater.from(parent.context)))


    }


        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind (position)
}

    override fun getItemCount()= titles.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }
}