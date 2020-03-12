package com.trainingtrack.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShowGuess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_guess)

        val guess = intent.getStringExtra("guess")
    }
}
