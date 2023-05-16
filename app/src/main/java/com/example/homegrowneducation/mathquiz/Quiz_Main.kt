package com.example.homegrownEducation.mathquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.homegrowneducation.R

class Quiz_Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_main)

        val Qadd = findViewById<ImageView>(R.id.Qadd)
        val Qminus = findViewById<ImageView>(R.id.Qminus)
        val Qmulti = findViewById<ImageView>(R.id.Qmultipulation)
        val Qdivision = findViewById<ImageView>(R.id.Qdivision)

        Qadd.setOnClickListener {
            val intent = Intent(this,Quiz_Page::class.java)
            intent.putExtra("cal","+")
            startActivity(intent)
        }

        Qminus.setOnClickListener {
            val intent = Intent(this,Quiz_Page::class.java)
            intent.putExtra("cal","-")
            startActivity(intent)
        }

        Qmulti.setOnClickListener {
            val intent = Intent(this,Quiz_Page::class.java)
            intent.putExtra("cal","x")
            startActivity(intent)
        }

        Qdivision.setOnClickListener {
            val intent = Intent(this,Quiz_Page::class.java)
            intent.putExtra("cal","/")
            startActivity(intent)
        }
    }

}