package com.example.calcfig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
    }
    public fun onSquareButtonCalculate(view: View)
    {
        val textArea = findViewById<TextView>(R.id.trapezoidArea)
        val textDiagonal = findViewById<TextView>(R.id.trapezoidDiagonal)


        val SideA = findViewById<EditText>(R.id.sideA)



        val a = SideA.text.toString().toDoubleOrNull()



        fun getArea(a: Double): Double
        {
            return a*a
        }
        fun getDiagonal(a: Double): Double{
            return Math.sqrt(a*a)
        }

        if (a != null){

            textArea.text = "Площадь: ${getArea(a)}"
            textDiagonal.text = "Диагональ: ${getDiagonal(a)}"



        }
        else{
            textArea.text = "Ошибка ввода, проверьте введённые данные";
        }
    }
}