package com.trainingtrack.guessinggame

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_guess.*

class ShowGuess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_guess)

        val extra: Bundle? = intent.extras
        if(extra != null) {
            textView.text = extra.getString("guess")
        }

        textView.setOnClickListener {
            intent.putExtra("message", "From Show Guess Activity")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }



}
