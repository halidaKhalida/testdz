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
        loadQuestions()
        initViews()
    }


    private fun initViews() {
        val data = intent.getStringExtra("Qummi")
        tvName = findViewById(R.id.tv_name)
        tvQuestion = findViewById(R.id.tv_question)
        tvQuestionNumber = findViewById(R.id.tv_question_number)
        rbAnswer1 = findViewById(R.id.rb_answer1)
        rbAnswer2 = findViewById(R.id.rb_answer2)
        rbAnswer3 = findViewById(R.id.rb_answer3)
        rbAnswer4 = findViewById(R.id.rb_answer4)
        bSubmitNext = findViewById(R.id.b_submit_next)
        tvName.text = data

        setQuestion(count)




        bSubmitNext.setOnClickListener {


                count++
                tvQuestionNumber.text=("Правильные ${count.toString()} /10")
                if (count==10){
                    count=0
                }

                rbAnswer1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
            rbAnswer2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
            rbAnswer3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
            rbAnswer4.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvQuestionNumber.text=("2/10")
                }
                tvQuestion.text="2. Переведите данное слово  ,, كتاب ,, на русский язык."
                rbAnswer1.text="Ручка"
                rbAnswer2.text="Тетрадь"
                rbAnswer3.text="Карандаш"
                rbAnswer4.text="Книга"

                bSubmitNext.setOnClickListener {
                    rbAnswer1.setOnClickListener {
                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                    }
                    rbAnswer2.setOnClickListener {
                        Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                        tvQuestionNumber.text = ("3/10")
                    }
                    rbAnswer3.setOnClickListener {
                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                    }
                    rbAnswer4.setOnClickListener {
                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                    }
                    tvQuestion.text = "3. Переведите данное слово  ,, كن متفاجئا ,, на русский язык."
                    rbAnswer1.text = "Смеятся"
                    rbAnswer2.text = "Удивлятся"
                    rbAnswer3.text = "Радоватся"
                    rbAnswer4.text = "Плакать"

                    bSubmitNext.setOnClickListener {
                        rbAnswer1.setOnClickListener {
                            Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                            tvQuestionNumber.text = ("4/10")
                        }
                        rbAnswer2.setOnClickListener {
                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                        }
                        rbAnswer3.setOnClickListener {
                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                        }
                        rbAnswer4.setOnClickListener {
                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                        }
                        tvQuestion.text = "4. Переведите данное слово  ,, تفاحة ,, на русский язык."
                        rbAnswer1.text = "Яблоко"
                        rbAnswer2.text = "Груша"
                        rbAnswer3.text = "Виноград"
                        rbAnswer4.text = "Ананас"

                        bSubmitNext.setOnClickListener {
                            rbAnswer1.setOnClickListener {
                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                            }
                            rbAnswer2.setOnClickListener {
                                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                                tvQuestionNumber.text = ("5/10")
                            }
                            rbAnswer3.setOnClickListener {
                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                            }
                            rbAnswer4.setOnClickListener {
                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                            }
                            tvQuestion.text = "5. Переведите данное слово  ,, قمر ,, на русский язык."
                            rbAnswer1.text = "Солнце"
                            rbAnswer2.text = "Луна"
                            rbAnswer3.text = "Земля"
                            rbAnswer4.text = "Марс"

                            bSubmitNext.setOnClickListener {
                                rbAnswer1.setOnClickListener {
                                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                                    tvQuestionNumber.text = ("6/10")
                                }
                                rbAnswer2.setOnClickListener {
                                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                }
                                rbAnswer3.setOnClickListener {
                                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                }
                                rbAnswer4.setOnClickListener {
                                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                }
                                tvQuestion.text =
                                    "6. Ответьте на вопрос: ما اسم الملاك الذي نقل الله بواسطته القرآن على النبي محمد (صلى الله عليه وسلم)؟"
                                rbAnswer1.text = "جبريل عليه السلام"
                                rbAnswer2.text = "عزرائيل عليه السلام"
                                rbAnswer3.text = "إسرافيل عليه السلام"
                                rbAnswer4.text = "ميكائيل عليه السلام"

                                bSubmitNext.setOnClickListener {
                                    rbAnswer1.setOnClickListener {
                                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                    }
                                    rbAnswer2.setOnClickListener {
                                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                    }
                                    rbAnswer3.setOnClickListener {
                                        Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                                        tvQuestionNumber.text = ("7/10")
                                    }
                                    rbAnswer4.setOnClickListener {
                                        Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                                    }
                                    tvQuestion.text = "7. Ответьте на вопрос: ما هو اسم آخر نبي؟"
                                    rbAnswer1.text = "اسماعيل عليه السلام"
                                    rbAnswer2.text = "موسى عليه السلام"
                                    rbAnswer3.text = "إبراهيم عليه السلام"
                                    rbAnswer4.text = "محمد صلي الله عليه وسلم"

                                    bSubmitNext.setOnClickListener {
                                        rbAnswer1.setOnClickListener {
                                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                .show()
                                        }
                                        rbAnswer2.setOnClickListener {
                                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                .show()
                                        }
                                        rbAnswer3.setOnClickListener {
                                            Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT)
                                                .show()
                                            tvQuestionNumber.text = ("8/10")
                                        }
                                        rbAnswer4.setOnClickListener {
                                            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                .show()
                                        }
                                        tvQuestion.text = "8. Ответьте на вопрос: من كان أول نبي؟"
                                        rbAnswer1.text = "اسماعيل عليه السلام"
                                        rbAnswer2.text = "موسى عليه السلام"
                                        rbAnswer3.text = "آدم عليه السلام"
                                        rbAnswer4.text = "إبراهيم عليه السلام"

                                        bSubmitNext.setOnClickListener {
                                            rbAnswer1.setOnClickListener {
                                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                            rbAnswer2.setOnClickListener {
                                                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT)
                                                    .show()
                                                tvQuestionNumber.text = ("9/10")
                                            }
                                            rbAnswer3.setOnClickListener {
                                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                            rbAnswer4.setOnClickListener {
                                                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                            tvQuestion.text =
                                                "9. Ответьте на вопрос: في أي شهر نزل القرآن؟"
                                            rbAnswer1.text = "يناير"
                                            rbAnswer2.text = "رمضان"
                                            rbAnswer3.text = "ديسمبر"
                                            rbAnswer4.text = "سبتمبر"

                                            bSubmitNext.setOnClickListener {
                                                rbAnswer1.setOnClickListener {
                                                    Toast.makeText(
                                                        this,
                                                        "Неверно!",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                                rbAnswer2.setOnClickListener {
                                                    Toast.makeText(
                                                        this,
                                                        "Неверно!",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                                rbAnswer3.setOnClickListener {
                                                    Toast.makeText(
                                                        this,
                                                        "Неверно!",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                                rbAnswer4.setOnClickListener {
                                                    Toast.makeText(
                                                        this,
                                                        "Верно!",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                    tvQuestionNumber.text = ("10/10")
                                                }
                                                tvQuestion.text =
                                                    "10. Ответьте на вопрос: كم عدد السور في القرآن؟"
                                                rbAnswer1.text = "115"
                                                rbAnswer2.text = "132"
                                                rbAnswer3.text = "113"
                                                rbAnswer4.text = "114"







                                                if (rbAnswer1.isChecked) {
                                                    selected = 1
                                                } else if (rbAnswer2.isChecked) {
                                                    selected = 2
                                                } else if (rbAnswer3.isChecked) {
                                                    selected = 3
                                                } else if (rbAnswer4.isChecked) {
                                                    selected = 4
                                                }

                                                if (selected == questions[count].togriJavob) {
                                                    count++
                                                    setQuestion(count)
                                                } else {
                                                    Toast.makeText(
                                                        this,
                                                        "Javob noto'g'ri",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

        }

    }

    private fun setQuestion(i: Int) {
        selected = 0
        tvQuestionNumber.text = "Question ${i + 1}/${questions.size}"
        tvQuestion.text = questions[i].savol
        rbAnswer1.text = questions[i].javob1
        rbAnswer1.isChecked = false
        rbAnswer2.text = questions[i].javob2
        rbAnswer2.isChecked = false
        rbAnswer3.text = questions[i].javob3
        rbAnswer3.isChecked = false
        rbAnswer4.text = questions[i].javob4
        rbAnswer4.isChecked = false
    }

    private fun loadQuestions() {
        questions = ArrayList()
        questions.add(Question("1. Переведите данные слова  ,, السلام عليك ,, на русский язык.", "Мир вам", "Как у вас дела?", "Удачного дня", "Здравствуйте", 1))
        questions.add(Question("Savol2", "javob1", "javob2", "javob3", "javob4", 4))
        questions.add(Question("Savol3", "javob1", "javob2", "javob3", "javob4", 2))
        questions.add(Question("Savol4", "javob1", "javob2", "javob3", "javob4", 1))
        questions.add(Question("Savol5", "javob1", "javob2", "javob3", "javob4", 2))
        questions.add(Question("Savol6", "javob1", "javob2", "javob3", "javob4", 1))
        questions.add(Question("Savol7", "javob1", "javob2", "javob3", "javob4", 3))
        questions.add(Question("Savol8", "javob1", "javob2", "javob3", "javob4", 3))
        questions.add(Question("Savol9", "javob1", "javob2", "javob3", "javob4", 2))
        questions.add(Question("Savol10", "javob1", "javob2", "javob3", "javob4", 4))
    }
}