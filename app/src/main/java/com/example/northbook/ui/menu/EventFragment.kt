package com.example.northbook.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.EventAdapter
import com.example.northbook.databinding.FragmentEventBinding
import com.example.northbook.entity.Event

class EventFragment : Fragment() {

    private var _binding: FragmentEventBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val news = listOf(
            Event(
                R.drawable.event2,
                "Ночь в библиотеке",
                "В ночь с 17 на 18 октября библиотека работает всю ночь.",
                ""
            ),
            Event(
                R.drawable.event3,
                "Разговорный клуб",
                "22 октября проёдёт первое собрание разговорного клуба",
                ""
            ),
            Event(
                R.drawable.event4,
                "Школа программирования",
                "28 октября открывается школа программирования",
                ""
            ),

        )
        binding.recyclerNews.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerNews.adapter = EventAdapter(news)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}