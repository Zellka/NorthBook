package com.example.northbook.ui.menu

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.GoalAdapter
import com.example.northbook.databinding.FragmentPlansBinding
import com.example.northbook.entity.Goal

class PlansFragment : Fragment() {

    private var _binding: FragmentPlansBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlansBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val goals = listOf<Goal>(
            Goal("Название1", "Автор1", "10", "день", "год"),
            Goal("Название1", "Автор1", "10", "день", "год"),
            Goal("Название1", "Автор1", "10", "день", "год"),
            Goal("Название1", "Автор1", "10", "день", "год"),
            Goal("Название1", "Автор1", "10", "день", "год")
        )
        binding.recyclerGoal.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerGoal.adapter = GoalAdapter(goals)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.add_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_add) {
            findNavController().navigate(R.id.action_plansFragment_to_goalFragment)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}