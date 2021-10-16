package com.example.northbook.ui.book

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
            Review("Имя Фамилия1", 4, "супер пупер"),
            Review("Имя Фамилия2", 1, "супер пупер"),
            Review("Имя Фамилия3", 2, "супер пупер"),
            Review("Имя Фамилия4", 4, "супер пупер"),
            Review("Имя Фамилия5", 1, "фууу"),
            Review("Имя Фамилия6", 2, "супер пупер"),
            Review("Имя Фамилия5", 5, "супер пупер"),
            Review("Имя Фамилия3", 2, "ужас"),
            Review("Имя Фамилия3", 3, "супер пупер"),
        )
        binding.recyclerReview.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerReview.adapter = ReviewAdapter(reviews)
    }
}