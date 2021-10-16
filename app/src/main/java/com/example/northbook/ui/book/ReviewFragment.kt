package com.example.northbook.ui.book

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.ReviewAdapter
import com.example.northbook.databinding.FragmentReviewBinding
import com.example.northbook.entity.Review

class ReviewFragment : Fragment() {

    private var _binding: FragmentReviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val reviews = listOf<Review>(
            Review(
                R.drawable.ava2,
                "Александр Гриднев",
                1,
                "Книга скучная, плохой сюжет. Мне не понравилось"
            ),
            Review(R.drawable.ava3, "Иван Кубасов", 5, "Лучшая книга. Очень интересно"),
            Review(R.drawable.ava1, "Ольга Малькова", 3, "Книга на один раз"),
            Review(
                R.drawable.ava4, "Нина Харина",
                4,
                "Не могла остановиться. Класс"
            )
        )
        binding.recyclerReview.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerReview.adapter = ReviewAdapter(reviews)
    }
}