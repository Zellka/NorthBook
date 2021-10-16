package com.example.northbook.ui.category

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
import com.example.northbook.databinding.FragmentTrendsBinding
import com.example.northbook.entity.Book
import com.example.northbook.ui.book.BookActivity

class TrendsFragment : Fragment(), ClickListener {

    private var _binding: FragmentTrendsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrendsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val books = listOf<Book>(
            Book("Руководство к действию на ближайшие дни", "Й. Блум", 4),
            Book("Ход королевы", "У. Тевис", 4),
            Book("Дюна", "Ф. Герберт", 5),
            Book("Снежная сказка", "А. Полярный", 2),
            Book("Гарри Поттер", "Д. Роулинг", 5),
            Book("Завтрак у Тиффани", "Т. Капоте", 5),
            Book("Ночной дозор", "С. Лукьяненко", 5),
            Book("Портрет Дориана Грея", "О. Уайлд", 5),
            Book("Идиот", "Ф. Достоевский", 1)
        )

        val list = listOf<Int> (
            R.drawable.bb1,
            R.drawable.bb2,
            R.drawable.bb3,
            R.drawable.bb4,
            R.drawable.bb5,
            R.drawable.bb6,
            R.drawable.bb7,
            R.drawable.bb8,
            R.drawable.bb9
        )

        binding.recyclerTrends.layoutManager = GridLayoutManager(this.requireContext(), 3)
        binding.recyclerTrends.adapter = BookAdapter(books, this,list)
    }

    override fun showBook(book: Book) {
        startActivity(Intent(this.requireContext(), BookActivity::class.java))
    }
}