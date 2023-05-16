package com.example.homegrowneducation.mathexec

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.homegrowneducation.R

class Exec_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exc_main)

        val Eadd = findViewById<ImageView>(R.id.Eadd)
        val Eminus = findViewById<ImageView>(R.id.Eminus)
        val Emulti = findViewById<ImageView>(R.id.Emultipulation)
        val Edivision = findViewById<ImageView>(R.id.Edivision)

        Eadd.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","+")
            startActivity(intent)
        }

        Eminus.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","-")
            startActivity(intent)
        }

        Emulti.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","x")
            startActivity(intent)
        }

        Edivision.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","/")
            startActivity(intent)
        }
    }
}