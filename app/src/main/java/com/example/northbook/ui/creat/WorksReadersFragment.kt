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
            Book("Название1", "Автор1", 1),
            Book("Название2", "Автор2", 2),
            Book("Название3", "Автор3", 3),
            Book("Название4", "Автор4", 4),
            Book("Название1", "Автор1", 1),
            Book("Название2", "Автор2", 2),
            Book("Название3", "Автор3", 3),
            Book("Название4", "Автор4", 4),
            Book("Название1", "Автор1", 1),
            Book("Название2", "Автор2", 2),
            Book("Название3", "Автор3", 3),
            Book("Название4", "Автор4", 4),
            Book("Название1", "Автор1", 1),
            Book("Название2", "Автор2", 2),
            Book("Название3", "Автор3", 3),
            Book("Название4", "Автор4", 4)
        )
        binding.recycler.layoutManager = GridLayoutManager(this.requireContext(), 3)
        binding.recycler.adapter = BookAdapter(books, this)
    }

    override fun showBook(book: Book) {
        startActivity(Intent(this.requireContext(), NewBookActivity::class.java))
    }
}