package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragments.R.id.secondtext
class Second_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view:View= inflater.inflate(R.layout.fragment_second_, container, false)
        val sec_textviewer=view.findViewById<TextView>(secondtext)
        return view
    }


}