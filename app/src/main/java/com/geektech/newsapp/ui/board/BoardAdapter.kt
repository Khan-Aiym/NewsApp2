package com.geektech.newsapp.ui.board

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.newsapp.R
import com.geektech.newsapp.ui.models.Board

class BoardAdapter : RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {

    private lateinit var list: ArrayList<Board>
    private lateinit var lottie : ArrayList<Int>

    fun BoardAdapter(){
        list = ArrayList()
        list.add(Board("Name", "Khan-Aim"))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class BoardViewHolder : RecyclerView.ViewHolder() {

    }
}