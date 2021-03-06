package com.zarisa.fragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//hello
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var buttonFirstFragment=view.findViewById<Button>(R.id.button)
        val bundle = bundleOf("some_text" to "passing successful",
            "true_Boolean" to true,"false_Boolean" to false)
        buttonFirstFragment.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment2,bundle)
        }
    }

}
