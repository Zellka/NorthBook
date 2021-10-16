package com.example.northbook.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.GenreListener
import com.example.northbook.adapter.GenresAdapter
import com.example.northbook.databinding.FragmentGenresBinding

class GenresFragment : Fragment(), GenreListener {

    private var _binding: FragmentGenresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGenresBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val genres = listOf<String>(
            "Зарубежная литература",
            "Фантастика",
            "Современная проза",
            "Детективы",
            "Фентези",
            "История",
            "Психология"
        )
        binding.recyclerGenres.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerGenres.adapter = GenresAdapter(genres, this)
    }

    override fun showBooks(genre: String) {
        findNavController().navigate(R.id.action_booksFragment_to_listBookFragment)
    }
}