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
import com.example.northbook.databinding.FragmentBookListBinding
import com.example.northbook.entity.Book
import com.example.northbook.ui.book.BookActivity

class BookListFragment : Fragment(), ClickListener {

    private var _binding: FragmentBookListBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBookListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val books = listOf<Book>(
            Book("Над пропастью во ржи", "Д. Сэлинджер", 4),
            Book("Игра в бисер", "Г. Гессе", 5),
            Book("Мартин Иден", "Д. Лондон", 5),
            Book("Так говорил Заратустра", "Ф. Ницше", 4),
            Book("Щегол", "Д. Тартт", 4),
            Book("Степной волк", "Г. Гесе", 5),
            Book("Бесы", "Ф. Достоевский", 5),
            Book("Марсианские хроники", "Р. Брэдбери", 5),
            Book("Творцы совпадений", "Й. Блум", 4)
        )

        val list = listOf<Int> (
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
            R.drawable.b4,
            R.drawable.b5,
            R.drawable.b6,
            R.drawable.b7,
            R.drawable.b1,
            R.drawable.b9
        )

        binding.recyclerBookList.layoutManager = GridLayoutManager(this.requireContext(), 3)
        binding.recyclerBookList.adapter = BookAdapter(books, this,list)
    }

    override fun showBook(book: Book) {
        startActivity(Intent(this.requireContext(), BookActivity::class.java))
    }
}