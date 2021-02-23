package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val correct_answers = intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)
        val total_questions = intent.getIntExtra(Constants.TOTAL_QUESTIONS , 0)

        tv_score.text = "Your Score is $correct_answers out of $total_questions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity:: class.java))
            finish()
        }
    }
}