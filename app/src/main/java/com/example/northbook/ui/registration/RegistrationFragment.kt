package com.example.northbook.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import androidx.navigation.fragment.findNavController
import com.example.northbook.R


class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Toolbar>(R.id.fragment_registration_toolbar)
            .setNavigationOnClickListener {
                findNavController().popBackStack()
            }
        view.findViewById<Button>(R.id.fragment_registration_button)
            .setOnClickListener {
                findNavController().navigate(R.id.action_registrationFragment_to_endRegistrationFragment)
            }
    }
}