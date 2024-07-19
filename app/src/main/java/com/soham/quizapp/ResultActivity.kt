package com.soham.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    private var resultName : TextView? = null
    private var resultScore : TextView? = null
    private var btnFinish : Button? = null
    private var mUserName: String? = null
    private var mCorrectAnswers: Int = 0
    private var mTotalQuestions: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultName = findViewById(R.id.tv_resultName)
        resultScore = findViewById(R.id.tv_resultScore)
        btnFinish = findViewById(R.id.btn_finish)

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        mTotalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        resultName?.text = mUserName
        resultScore?.text = "Your Score is $mCorrectAnswers out of $mTotalQuestions"

        btnFinish?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}