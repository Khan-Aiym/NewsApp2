package com.geektech.newsapp.models

import android.icu.text.CaseMap
import java.io.Serializable

data class News(
     val title: String,
    val createdAt: Long
) : Serializable
