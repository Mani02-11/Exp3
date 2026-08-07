package com.example.exp3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    private lateinit var title: TextView
    private lateinit var description: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        title = view.findViewById(R.id.txtTitle)
        description = view.findViewById(R.id.txtDescription)

        val course = arguments?.getString("course")

        title.text = course

        description.text = when (course) {

            "Android" ->
                """
Course: Android Development

• Platform: Android Studio
• Language: Kotlin / Java
• Duration: 8 Weeks
• Level: Intermediate

Topics Covered:
✓ Activities
✓ Fragments
✓ RecyclerView
✓ SQLite
✓ Firebase
✓ Material Design

Career Roles:
Android Developer
Mobile Application Developer
""".trimIndent()

            "Java" ->
                """
Course: Java Programming

• Duration: 10 Weeks
• Level: Beginner

Topics Covered:
✓ OOP Concepts
✓ Collections
✓ Exception Handling
✓ Multithreading
✓ JDBC
✓ File Handling

Career Roles:
Java Developer
Backend Developer
""".trimIndent()

            "Kotlin" ->
                """
Course: Kotlin Programming

• Duration: 6 Weeks
• Level: Beginner

Topics Covered:
✓ Variables
✓ Classes
✓ Functions
✓ Null Safety
✓ Coroutines
✓ Android Integration

Career Roles:
Android Developer
""".trimIndent()

            "Python" ->
                """
Course: Python Programming

• Duration: 8 Weeks

Topics Covered:
✓ Functions
✓ OOP
✓ NumPy
✓ Pandas
✓ Django
✓ Flask

Career Roles:
Python Developer
Data Analyst
""".trimIndent()

            "Database" ->
                """
Course: Database Management

• Duration: 6 Weeks

Topics Covered:
✓ SQL
✓ MySQL
✓ MongoDB
✓ Joins
✓ Transactions
✓ Normalization

Career Roles:
Database Administrator
SQL Developer
""".trimIndent()

            "Data Structures" ->
                """
Course: Data Structures

Topics Covered:
✓ Arrays
✓ Linked List
✓ Stack
✓ Queue
✓ Trees
✓ Graphs

Career Roles:
Software Engineer
""".trimIndent()

            "Operating Systems" ->
                """
Course: Operating Systems

Topics Covered:
✓ Processes
✓ Threads
✓ CPU Scheduling
✓ Deadlock
✓ Memory Management

Career Roles:
System Engineer
""".trimIndent()

            "Computer Networks" ->
                """
Course: Computer Networks

Topics Covered:
✓ OSI Model
✓ TCP/IP
✓ Routing
✓ Switching
✓ DNS
✓ HTTP

Career Roles:
Network Engineer
""".trimIndent()

            "Machine Learning" ->
                """
Course: Machine Learning

Topics Covered:
✓ Regression
✓ Classification
✓ Random Forest
✓ SVM
✓ Clustering

Career Roles:
ML Engineer
Data Scientist
""".trimIndent()

            "Cloud Computing" ->
                """
Course: Cloud Computing

Topics Covered:
✓ AWS
✓ Azure
✓ Google Cloud
✓ Docker
✓ Kubernetes

Career Roles:
Cloud Engineer
DevOps Engineer
""".trimIndent()

            "Cyber Security" ->
                """
Course: Cyber Security

Topics Covered:
✓ Cryptography
✓ Network Security
✓ Firewalls
✓ Ethical Hacking
✓ Malware Analysis

Career Roles:
Security Analyst
Penetration Tester
""".trimIndent()

            "Artificial Intelligence" ->
                """
Course: Artificial Intelligence

Topics Covered:
✓ Expert Systems
✓ NLP
✓ Computer Vision
✓ Deep Learning
✓ Robotics

Career Roles:
AI Engineer
Research Engineer
""".trimIndent()

            else ->
                "Select a course to view complete details."
        }

        return view
    }
}