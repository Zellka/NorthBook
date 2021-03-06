package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R

class GenresAdapter(var items: List<String>, private val listener: GenreListener) :
    RecyclerView.Adapter<GenresAdapter.GenresHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        GenresHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false)
        )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: GenresHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener.showBooks(items[position])
        }
    }

    inner class GenresHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val genre = itemView.findViewById<TextView>(R.id.genre)
        fun bind(item: String) {
            genre.text = item
        }
    }
}

interface GenreListener {
    fun showBooks(genre: String)
}