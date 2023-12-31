package com.example.calcfig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class TriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)
    }
    public fun onTriangleButtonCalculate(view: View)
    {
        val textArea = findViewById<TextView>(R.id.trapezoidArea)
        val textHeight = findViewById<TextView>(R.id.trapezoidMidLine)
        val textRadiusLow = findViewById<TextView>(R.id.trapezoidDiagonal1)
        val textRadius = findViewById<TextView>(R.id.TrapezoidDiagonal2)

        val SideA = findViewById<EditText>(R.id.sideA)
        val SideB = findViewById<EditText>(R.id.sideB)
        val SideC = findViewById<EditText>(R.id.H)

        val a = SideA.text.toString().toDoubleOrNull()
        val b = SideB.text.toString().toDoubleOrNull()
        val c = SideC.text.toString().toDoubleOrNull()

        fun getArea(a: Double, b: Double, c:Double): Double
        {
            val pp = (a + b + c)/2
            return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c))
        }
        fun getHeight(area: Double, a: Double): Double{
            return (2 * area / 2)
        }
        fun getRadiuslow(a: Double, b: Double, c: Double): Double{
            val pp = (a + b + c)/2
            return getArea(a,b,c) / pp
        }
        fun getRadius(a: Double, b: Double, c: Double): Double{
            val pp = (a + b + c)/2
            return (a * b * c) / (4 * Math.sqrt(pp * (pp-a) * (pp-c)))
        }
        if (a != null && b != null && c != null){
            if(a+b>c && b+c>a && a+c>b){
                textArea.text = "Площадь: ${getArea(a,b,c)}"
                textHeight.text = "Высота: ${getHeight(getArea(a,b,c),a)}"
                textRadiusLow.text = "radiuslow: ${getRadiuslow(a,b,c)}"
                textRadius.text = "radiusBig: ${getRadius(a,b,c)}"
            }
            else{
                textArea.text = "не бывает такое ты лгун лгун обманщик"
            }

        }
        else{
            textArea.text = "Ошибка ввода, проверьте введённые данные";
        }
    }
}