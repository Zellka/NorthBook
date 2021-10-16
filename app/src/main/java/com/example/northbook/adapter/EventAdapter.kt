package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.Event

class EventAdapter(var items: List<Event>) :
    RecyclerView.Adapter<EventAdapter.EventHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EventHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: EventHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class EventHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleNews = itemView.findViewById<TextView>(R.id.title_event)
        private val news = itemView.findViewById<TextView>(R.id.content)
        private val imgEvent = itemView.findViewById<ImageView>(R.id.img_event)
        fun bind(item: Event) {
            titleNews.text = item.title
            news.text = item.content
            imgEvent.setImageResource(item.image)
        }
    }
}