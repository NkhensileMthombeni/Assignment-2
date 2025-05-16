package com.example.asignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questions = listOf(
          Question("Did Manchester City win the champions league 2023?", true),
            Question("Does Manchester City have more Premier Leagues than Manchester United?", false),
          Question("Has Manchester City won a treble before?", true),
          Question("Is Xavi Hernandez the manager of Manchester City?", true),
            Question("Is Manchester City a better team than Newcastle United?", true)

    }

                  private var currentIndex = 0
                  private var score = 0


    findViewById<Button>(R.id.btn).setOnClickListener {checkAnswer(true)

    findViewById<Button>(R.id.btnFalse).setOnClickListener { checkAnswer(false)



















}
