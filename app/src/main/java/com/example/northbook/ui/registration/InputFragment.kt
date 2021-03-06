package com.example.northbook.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.northbook.R

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.input_text).setOnClickListener {
            findNavController().navigate(R.id.action_inputFragment_to_registrationFragment)
        }

        view.findViewById<Button>(R.id.fragment_input_button).setOnClickListener {
            findNavController().navigate(R.id.action_inputFragment_to_checkFragment)
        }
    }
}