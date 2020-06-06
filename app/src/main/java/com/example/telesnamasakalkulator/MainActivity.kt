package com.example.telesnamasakalkulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100 // От Тук взимаме информацията от текста и конвертираме в метри.
            val w = weight.text.toString().toFloat() // От тук ще вземем информацията от текста и я конвертираме към Float.
            val res = w/(h*h) // Това е формулата за изчисляване на телесната маса.
            result.text = "%.2f".format(res) // Форматираме резултата за да го покаже в две десетици.
        }
    }

}