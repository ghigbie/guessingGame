package com.trainingtrack.guessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        guessButton.setOnClickListener {
            val guess = editText.text.toString().trim()
            if(!guess.isEmpty()) {
                intent = Intent(this, ShowGuess::class.java)
                intent.putExtra("guess", guess)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Enter guess", Toast.LENGTH_SHORT)
            }
        }
    }

}
