package com.example.northbook.ui.creat

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.BookAdapter
import com.example.northbook.adapter.ClickListener
import com.example.northbook.adapter.CreatPagerAdapter
import com.example.northbook.adapter.SectionPagerAdapter
import com.example.northbook.databinding.FragmentPlansBinding
import com.example.northbook.databinding.FragmentWorksReadersBinding
import com.example.northbook.entity.Book
import com.example.northbook.ui.book.BookActivity

class WorksReadersFragment : Fragment() , ClickListener {

    private var _binding: FragmentWorksReadersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWorksReadersBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val books = listOf<Book>(
            Book("Сборник стихов о Любви", "И. Петров", 5),
            Book("Кошки мышки", "Г. Иванова", 5),
            Book("Детство", "П. Каценович", 4),
            Book("Страшные истории", "А. Зибар", 4),
            Book("Воробей", "Д. Кац", 4),
            Book("Осень", "Ф. Зивина", 3),
            Book("Море", "А. Куков", 3),
            Book("Полет", "Ф. Попов", 2),
            Book("Радость", "У. Радов", 1),
        )

        val list = listOf<Int> (
            R.drawable.bbb1,
            R.drawable.bbb2,
            R.drawable.bbb3,
            R.drawable.bbb4,
            R.drawable.bbb5,
            R.drawable.bbb6,
            R.drawable.bbb7,
            R.drawable.bbb8,
            R.drawable.bbb9
        )

        binding.recycler.layoutManager = GridLayoutManager(this.requireContext(), 3)
        binding.recycler.adapter = BookAdapter(books, this, list)
    }

    override fun showBook(book: Book) {
        startActivity(Intent(this.requireContext(), BookActivity::class.java))
    }
}