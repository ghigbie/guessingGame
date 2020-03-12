package com.trainingtrack.guessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        guessButton.setOnClickListener {
            val guess = editText.text.toString()
            if(guess != null) {
                intent = Intent(this, ShowGuess::class.java)
                intent.putExtra("guess", guess)
                startActivity(intent)
            }
        }
    }

}
