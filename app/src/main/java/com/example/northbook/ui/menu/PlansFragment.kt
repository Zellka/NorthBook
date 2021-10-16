package com.example.northbook.ui.menu

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.northbook.R
import com.example.northbook.adapter.GoalAdapter
import com.example.northbook.adapter.GoalListener
import com.example.northbook.databinding.FragmentPlansBinding
import com.example.northbook.entity.Goal

class PlansFragment : Fragment(), GoalListener {

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
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        val goals = listOf<Goal>(
            Goal(R.drawable.book1,"Ход королевы", "У.Тевис", "10", "день", "10"),
            Goal(R.drawable.book2,"Снежная сказка", "А.Полярный", "50", "неделю", "30"),
            Goal(R.drawable.book3,"Гарри Поттер", "Д.Роулинг", "10", "час", "8"),
            Goal(R.drawable.book4,"Завтрак у Тиффани", "Т.Капоте", "20", "час", "20")
        )
        binding.recyclerGoal.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerGoal.adapter = GoalAdapter(goals, this)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.add_menu, menu)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun showGoal(goal: Goal) {
        findNavController().navigate(R.id.action_plansFragment_to_goalFragment)
    }
}