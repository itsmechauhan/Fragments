package com.example.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

import com.example.fragments.databinding.ActivityMainBinding
class First_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_first_, container, false)
        val textView:TextView=view.findViewById(R.id.firsttext)
        return view
    }

}