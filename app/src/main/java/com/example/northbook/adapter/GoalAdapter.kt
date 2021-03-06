package com.example.northbook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.northbook.R
import com.example.northbook.entity.Goal

class GoalAdapter(var items: List<Goal>, private var listener: GoalListener) :
    RecyclerView.Adapter<GoalAdapter.GoalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        GoalHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_goal, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: GoalHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener.showGoal(items[position])
        }
    }

    inner class GoalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageBook = itemView.findViewById<ImageView>(R.id.ic_goal)
        private val nameBook = itemView.findViewById<TextView>(R.id.name_book)
        private val authorBook = itemView.findViewById<TextView>(R.id.author_book)
        private val goalRead = itemView.findViewById<TextView>(R.id.goal_read)
        private val goalTime = itemView.findViewById<TextView>(R.id.goal_time)
        fun bind(item: Goal) {
            imageBook.setImageResource(item.image)
            nameBook.text = item.nameBook
            authorBook.text = item.author
            goalRead.text = "${item.countPage} страниц в ${item.periodRead}"
            goalTime.text = "За ${item.timeGoal} дней"
        }
    }
}

interface GoalListener {
    fun showGoal(goal: Goal)
}