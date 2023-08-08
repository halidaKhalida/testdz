package com.example.datatest

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class TestActivity : AppCompatActivity() {
    lateinit var tvName: TextView
    lateinit var tvQuestionNumber: TextView
    lateinit var tvQuestion: TextView
    lateinit var rbAnswer1: RadioButton
    lateinit var rbAnswer2: RadioButton
    lateinit var rbAnswer3: RadioButton
    lateinit var rbAnswer4: RadioButton
    lateinit var rgAnswers: RadioGroup
    lateinit var bSubmitNext: Button
    lateinit var questions: ArrayList<Question>
    var count = 0
    var selected = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        initViews()
    }


    private fun initViews() {
//        val data = intent.getStringExtra("Qummi")
//        tvName = findViewById(R.id.tv_name)
//        tvQuestion = findViewById(R.id.tv_question)
//        tvQuestionNumber = findViewById(R.id.tv_question_number)
//        rbAnswer1 = findViewById(R.id.rb_answer1)
//        rbAnswer2 = findViewById(R.id.rb_answer2)
//        rbAnswer3 = findViewById(R.id.rb_answer3)
//        rbAnswer4 = findViewById(R.id.rb_answer4)
//        bSubmitNext = findViewById(R.id.b_submit_next)
//        tvName.text = data


        bSubmitNext.setOnClickListener {
//
//
//
        }
    }
}