package com.example.calcfig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class RectangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)
    }
    public fun onRectangleButtonCalculate(view: View)
    {
        val textArea = findViewById<TextView>(R.id.trapezoidArea)
        val textDiagonal = findViewById<TextView>(R.id.trapezoidMidLine)
        val textRadiusLow = findViewById<TextView>(R.id.trapezoidDiagonal1)
        val textRadius = findViewById<TextView>(R.id.TrapezoidDiagonal2)

        val SideA = findViewById<EditText>(R.id.sideA)
        val SideB = findViewById<EditText>(R.id.sideB)


        val a = SideA.text.toString().toDoubleOrNull()
        val b = SideB.text.toString().toDoubleOrNull()


        fun getArea(a: Double, b: Double): Double
        {
            return a*b
        }
        fun getDiagonal(a: Double, b: Double): Double{
            return Math.sqrt(b*a)
        }
        fun getRadiuslow(a: Double, b: Double): Double{
            return Math.min(a,b)/2
        }
        fun getRadius(a: Double, b: Double): Double{
            return Math.sqrt(a.pow(2)+b.pow(2))/2
        }
        if (a != null && b != null){

                textArea.text = "Площадь: ${getArea(a,b)}"
                textDiagonal.text = "Диагональ: ${getDiagonal(a,b)}"
                textRadiusLow.text = "radiuslow: ${getRadiuslow(a,b)}"
                textRadius.text = "radius: ${getRadius(a,b)}"


        }
        else{
            textArea.text = "Ошибка ввода, проверьте введённые данные";
        }
    }
}