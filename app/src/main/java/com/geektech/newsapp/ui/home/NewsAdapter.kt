package com.geektech.newsapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.newsapp.databinding.ItemNewsBinding
import com.geektech.newsapp.databinding.ViewPagerBinding
import com.geektech.newsapp.models.News

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private val list = arrayListOf<News>()
    inner class
    ViewHolder(private var binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(news: News) {
            binding.textTitle.text=news.title
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount()  = list.size
    fun addItem(news: News) {
        list.add(0, news)
        notifyItemInserted(0)
    }
}
