package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

    }

    override fun onResume() {
        super.onResume()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        Toast.makeText(this, "Welcome Back Dude" , Toast.LENGTH_SHORT).show()

    }

    fun btnStart(view: View) {
        var name = etName.text.toString()

        if (name.trim().isEmpty()){
            etName.error = "Name Required"
        }else{
            val intent = Intent(this, QuizQuestionsActivity ::class.java)
            intent.putExtra(Constants.USER_NAME, etName.text.toString())
            startActivity(intent)
            finish()

            Toast.makeText(this, "Welcome to the Quiz App $name", Toast.LENGTH_SHORT).show()
        }

    }
}