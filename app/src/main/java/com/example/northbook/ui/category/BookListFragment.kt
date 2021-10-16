package com.example.northbook.ui.category

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.northbook.adapter.BookAdapter
import com.example.northbook.adapter.ClickListener
import com.example.northbook.databinding.FragmentBookListBinding
import com.example.northbook.entity.Book
import com.example.northbook.ui.book.BookActivity

class BookListFragment : Fragment(), ClickListener {

    private var _binding: FragmentBookListBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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
        binding.recyclerBookList.layoutManager = GridLayoutManager(this.requireContext(), 3)
        binding.recyclerBookList.adapter = BookAdapter(books, this)
    }

    override fun showBook(book: Book) {
        startActivity(Intent(this.requireContext(), BookActivity::class.java))
    }
}