package com.example.exp3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    private lateinit var listView: ListView

    private val courses = arrayOf(
        "Android",
        "Java",
        "Kotlin",
        "Python",
        "Database",
        "Data Structures",
        "Operating Systems",
        "Computer Networks",
        "Machine Learning",
        "Cloud Computing",
        "Cyber Security",
        "Artificial Intelligence"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        listView = view.findViewById(R.id.listView)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            courses
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->

            val selectedCourse = courses[position]

            val detailFragment = DetailFragment()

            val bundle = Bundle()
            bundle.putString("course", selectedCourse)
            detailFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, detailFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}