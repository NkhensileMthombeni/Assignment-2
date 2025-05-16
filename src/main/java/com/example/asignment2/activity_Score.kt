package com.example.asignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class activity_Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)
        val feedback = when (score) {
            5 -> "Excellent!"
            in 3..4 -> "Good Job!"
            else -> "Keep Practicing!"
        }

        findViewById<TextView>(R.id.txtScore).text = "You scored $score out of 5\n$feedback"

        findViewById<Button>(R.id.btnReview).setOnClickListener {
            // Could open a new ReviewActivity
        }

        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finishAffinity()
        }
    }
}
    }
}