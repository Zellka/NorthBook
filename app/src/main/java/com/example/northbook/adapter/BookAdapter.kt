package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.Book

class BookAdapter(var items: List<Book>, private val listener: ClickListener) :
    RecyclerView.Adapter<BookAdapter.BookHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BookHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener.showBook(items[position])
        }
    }

    inner class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameBook = itemView.findViewById<TextView>(R.id.name_book)
        private val authorBook = itemView.findViewById<TextView>(R.id.author_book)
        private val ratingBook = itemView.findViewById<RatingBar>(R.id.rating_book)
        fun bind(item: Book) {
            nameBook.text = item.name
            authorBook.text = item.author
            ratingBook.numStars = item.rating
        }
    }
}

interface ClickListener {
    fun showBook(book: Book)
}