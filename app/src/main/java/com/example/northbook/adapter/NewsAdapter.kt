package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.News

class NewsAdapter(var items: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        NewsHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleNews = itemView.findViewById<TextView>(R.id.title_news)
        private val dateNews = itemView.findViewById<TextView>(R.id.date_news)
        private val news = itemView.findViewById<TextView>(R.id.news)
        fun bind(item: News) {
            titleNews.text = item.title
            dateNews.text = item.publishedDate
            news.text = item.text
        }
    }
}