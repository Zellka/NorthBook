package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.Book

class BookAdapter(var items: List<Book>, private val listener: ClickListener, val list:List<Int> ) :
    RecyclerView.Adapter<BookAdapter.BookHolder>() {
//    val list = listOf<Int> (
//        R.drawable.b1,
//        R.drawable.b2,
//        R.drawable.b3,
//        R.drawable.b4,
//        R.drawable.b5,
//        R.drawable.b6,
//        R.drawable.b7,
//        R.drawable.b8,
//        R.drawable.b9
//    )

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
        private val image = itemView.findViewById<ImageView>(R.id.img_book)

        fun bind(item: Book) {
            nameBook.text = item.name
            authorBook.text = item.author
            ratingBook.numStars = item.rating
            if (position<9)
            image.setImageResource(list[position])
            else image.setImageResource(list[8])
        }
    }
}

interface ClickListener {
    fun showBook(book: Book)
}