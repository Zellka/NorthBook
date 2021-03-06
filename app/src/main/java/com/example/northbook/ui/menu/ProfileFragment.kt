package com.example.northbook.ui.menu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.northbook.R
import com.example.northbook.databinding.FragmentProfileBinding
import com.example.northbook.ui.events.AddEventActivity
import com.example.northbook.ui.statistics.StatisticsActivity

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        view.findViewById<Button>(R.id.button_stat).setOnClickListener {
            startActivity(Intent(activity, StatisticsActivity::class.java))
        }

        view.findViewById<Button>(R.id.button_add_event).setOnClickListener {
            startActivity(Intent(activity, AddEventActivity::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}