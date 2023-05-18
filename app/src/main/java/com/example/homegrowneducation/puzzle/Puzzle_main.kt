package com.example.homegrowneducation.puzzle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.PuzzleMainBinding
import com.example.homegrowneducation.mainPage.MainPage

class Puzzle_main : AppCompatActivity() {
    private lateinit var binding: PuzzleMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PuzzleMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.puzzleBackButton.setOnClickListener{
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

        binding.easyPuzzleArrow.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_easy_puzzle)
        }
        binding.normalPuzzleArrow.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_normal_puzzle)
        }
        binding.hardPuzzleArrow.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_hard_puzzle)
        }
    }

}