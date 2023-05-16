package com.example.homegrowneducation.MainPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.example.homegrownEducation.mathexec.Exec_main
import com.example.homegrownEducation.mathquiz.Quiz_Main
import com.example.homegrowneducation.R
import com.example.homegrowneducation.course.Course_main
import com.example.homegrowneducation.databinding.MainPageBinding
import com.google.firebase.auth.FirebaseAuth

class MainPage : AppCompatActivity() {

    private lateinit var binding: MainPageBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.quizArrow.setOnClickListener{
            val intent = Intent(this, Quiz_Main::class.java)
            startActivity(intent)
        }
        binding.puzzleArrow.setOnClickListener {
            val intent = Intent(this, Quiz_Main::class.java)
            startActivity(intent)
        }
        binding.execArrow.setOnClickListener {
            val intent = Intent(this, Exec_main::class.java)
            startActivity(intent)
        }
        binding.courseArrow.setOnClickListener {
            val intent = Intent(this, Course_main::class.java)
            startActivity(intent)
        }

        /*binding.btnlogout.setOnClickListener{
            auth.signOut()
            Intent(this, LoginActivity::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
                Toast.makeText(this, "Logout Successfully", Toast.LENGTH_SHORT).show()
            }*/
    }
}
