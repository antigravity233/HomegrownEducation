package com.example.homegrowneducation.course

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.CourseMainBinding
import com.example.homegrowneducation.mainPage.MainPage

class Course_main : AppCompatActivity() {
    private lateinit var binding: CourseMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CourseMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.courseBackButton.setOnClickListener{
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

        binding.courseArrow1.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_1)
        }
        binding.courseArrow2.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_2)
        }
        binding.courseArrow3.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_3)
        }
        binding.courseArrow4.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_4)
        }
        binding.courseArrow4.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_5)
        }
    }
}