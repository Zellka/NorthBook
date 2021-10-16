package com.example.northbook.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.adapter.BookAdapter
import com.example.northbook.adapter.NewsAdapter
import com.example.northbook.databinding.FragmentNewsBinding
import com.example.northbook.entity.Book
import com.example.northbook.entity.News

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val news = listOf<News>(
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News(
                "Хакатон в Салехарде",
                "15 октября",
                "Проходит соревнования для программистов в Полярисе"
            ),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News(
                "Хакатон в Салехарде",
                "15 октября",
                "Проходит соревнования для программистов в Полярисе"
            ),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News(
                "Хакатон в Салехарде",
                "15 октября",
                "Проходит соревнования для программистов в Полярисе"
            ),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News(
                "Хакатон в Салехарде",
                "15 октября",
                "Проходит соревнования для программистов в Полярисе"
            ),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу"),
            News(
                "Хакатон в Салехарде",
                "15 октября",
                "Проходит соревнования для программистов в Полярисе"
            ),
            News("Нашли старого мамонта", "10 октября", "Нашли очень древнего мамонтёнка Любу")
        )
        binding.recyclerNews.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerNews.adapter = NewsAdapter(news)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}