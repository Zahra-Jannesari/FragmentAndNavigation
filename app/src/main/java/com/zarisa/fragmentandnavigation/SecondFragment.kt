package com.zarisa.fragmentandnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment():Fragment(R.layout.fragment_second){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var textBox=view.findViewById<TextView>(R.id.textView2)
        val sentText = requireArguments().getString("some_text")
        val sentBoolean=requireArguments().getBoolean("false_Boolean")
        if (sentBoolean){
            textBox.text=sentText
        }
        else{
            textBox.visibility=View.INVISIBLE
        }
    }
}