package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.Book
import com.example.northbook.entity.Review

class ReviewAdapter(var items: List<Review>) :
    RecyclerView.Adapter<ReviewAdapter.ReviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ReviewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ReviewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class ReviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val authorReview = itemView.findViewById<TextView>(R.id.author_review)
        private val textReview = itemView.findViewById<TextView>(R.id.text_review)
        private val ratingReview = itemView.findViewById<RatingBar>(R.id.rating_review)
        fun bind(item: Review) {
            authorReview.text = item.author
            textReview.text = item.text
            ratingReview.numStars = item.rating
        }
    }
}