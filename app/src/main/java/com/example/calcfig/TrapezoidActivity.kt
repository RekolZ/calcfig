package com.example.calcfig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class TrapezoidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapezoid)
    }
    public fun onTriangleButtonCalculate(view: View)
    {
        val textArea = findViewById<TextView>(R.id.trapezoidArea)
        val textMidLine = findViewById<TextView>(R.id.trapezoidMidLine)
        val textRadius = findViewById<TextView>(R.id.trapezoidRadius)
        val textDFir = findViewById<TextView>(R.id.trapezoidDiagonal1)
        val textDSec = findViewById<TextView>(R.id.TrapezoidDiagonal2)

        val SideA = findViewById<EditText>(R.id.sideA)
        val SideB = findViewById<EditText>(R.id.sideB)
        val SideH = findViewById<EditText>(R.id.H)

        val a = SideA.text.toString().toDoubleOrNull()
        val b = SideB.text.toString().toDoubleOrNull()
        val h = SideH.text.toString().toDoubleOrNull()

        fun getArea(a: Double, b: Double, h:Double): Double
        {
            return ((a + b) * h)/2
        }
        fun getMidLine(a: Double, b: Double): Double
        {
            return (a + b )/ 2
        }
        fun getRadius(a: Double, b: Double, h: Double): Double{
            val raz = Math.abs(a - b)/2
            return ((a + b) / 2) * Math.sqrt(((h * h) +(raz * raz))/raz)
        }
        fun getDio(a: Double, h: Double): Double{
            return Math.sqrt(a*a+h+h)
        }

        if (a != null && b != null && h != null){
                textArea.text = "Площадь: ${getArea(a,b,h)}"
                textMidLine.text = "Средняя линия: ${getMidLine(getArea(a,b,h),a)}"
                textRadius.text = "radius: ${getRadius(a,b,h)}"
                textDFir.text = "d1: ${getDio(a,h)}"
                textDSec.text = "d2: ${getDio(b,h)}"


        }


    }
}